#include <iostream>
#include <stdio.h>
#include <memory.h>
#include <cmath>
#include <iomanip>
#include <vector>
using namespace std;

vector<int> bestSum(int tarNum, vector<int> vec)
{

    vector<int> result;
    vector<int> tmp_result;
    for (int i = 0; i < vec.size(); i++)
    {

        int remainder = tarNum - vec.at(i);
        if (remainder < 0)
            continue;
        ;
        if (remainder == 0)
        {
            result.push_back(vec[i]);
            return result;
        }
        vector<int> remainderComb = bestSum(remainder, vec);

        if (remainderComb.size() > 0)
        {
            remainderComb.push_back(vec.at(i));

            if (tmp_result.size() == 0 || remainderComb.size() < tmp_result.size())
            {
                tmp_result = remainderComb;
            }
        }
    }
    for (int i = 0; i < tmp_result.size(); i++)
    {
        result.push_back(tmp_result[i]);
    }
    return result;
}
int main()
{
    freopen("input.txt", "r", stdin);
    vector<int> inpu = {1, 4, 9, 8};
    vector<int> outp = bestSum(7, inpu);

    cout << endl;
}