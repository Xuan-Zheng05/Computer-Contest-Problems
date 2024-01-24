#include <stdio.h>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    string str, sub;
    while (cin >> str >> sub)
    {
        int pos;
        char largest = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str[i] > largest)
            {
                largest = str[i];
                pos = i;
            }
        }
        str.insert(pos + 1, sub);
        cout << str << endl;
    }
    return 0;
}