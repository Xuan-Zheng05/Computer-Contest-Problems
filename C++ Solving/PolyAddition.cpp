#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

struct Polynomial
{
    int base, power;
    Polynomial()
    {
        base = 0;
        power = 0;
    }
    Polynomial(int b, int p)
    {
        base = b;
        power = p;
    }
};

bool operator<(const Polynomial &a, const Polynomial &b)
{
    return a.power > b.power;
}

int main()
{
    freopen("input.txt", "r", stdin);
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        vector<Polynomial> vec;
        int base, power;
        cin >> base >> power;
        while (power > -1)
        {
            Polynomial temp(base, power);
            vec.push_back(temp);
            cin >> base >> power;
        }

        cin >> base >> power;
        while (power > -1)
        {
            Polynomial temp(base, power);
            vec.push_back(temp);
            cin >> base >> power;
        }

        sort(vec.begin(), vec.end());

        int prevBase, prevPower;
        Polynomial first = vec.at(0);
        prevBase = first.base;
        prevPower = first.power;
        int currBase, currPower;
        for (int j = 1; j < vec.size(); j++)
        {
            Polynomial num = vec.at(j);
            currBase = num.base;
            currPower = num.power;

            if (currPower != prevPower)
            {
                if (prevBase != 0)
                {
                    cout << "[ " << prevBase << " " << prevPower << " ] ";
                }
                prevBase = currBase;
                prevPower = currPower;
            }
            else
            {
                prevBase += currBase;
            }
        }
        if (currPower == prevPower)
        {
            if (prevBase != 0)
            {
                cout << "[ " << prevBase << " " << currPower << " ]" << endl;
            }
        }
        else
        {
            if (currBase != 0)
            {
                cout << "[ " << currBase << " " << currPower << " ]" << endl;
            }
        }
    }
    return 0;
}
