#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <bitset>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    int n, m;
    cin >> n >> m;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        cin >> arr[i];
    }

    for (int i = 0; i < m; i++)
    {
        char query;
        cin >> query;
        if (query == 'C')
        {
            int d;
            cin >> d;
            for (int i = 0; i < n; i++)
            {
                arr[i] += d;
                if (arr[i] > 65535)
                {
                    arr[i] = arr[i] % 65535;
                }
            }
        }
        else
        {
            int ones = 0;
            int d;
            cin >> d;
            for (int i = 0; i < n; i++)
            {
                bitset<32> bits(arr[i]);
                if (bits[d])
                {
                    ones++;
                }
            }
            cout << ones << endl;
        }
    }
    return 0;
}