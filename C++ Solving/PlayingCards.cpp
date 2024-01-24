#include <stdio.h>
#include <iostream>
#include <algorithm>
#include <vector>
#include <queue>
#include <string>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    queue<string> numArr[9];
    queue<string> suitArr[4];
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        string str;
        cin >> str;
        int num = str[1] - '1';
        numArr[num].push(str);
    }

    for (int i = 0; i < 9; i++)
    {
        queue<string> tmpQue = numArr[i];
        cout << "Queue" << i + 1 << ":";
        while (!(tmpQue.empty()))
        {
            string str = tmpQue.front();
            if (str[0] == 'A')
            {
                suitArr[0].push(str);
            }
            else if (str[0] == 'B')
            {
                suitArr[1].push(str);
            }
            else if (str[0] == 'C')
            {
                suitArr[2].push(str);
            }
            else if (str[0] == 'D')
            {
                suitArr[3].push(str);
            }
            cout << str << " ";
            tmpQue.pop();
        }
        cout << endl;
    }

    vector<string> vec;
    for (int i = 0; i < 4; i++)
    {
        queue<string> tmpQue = suitArr[i];
        cout << "Queue" << char(i + 'A') << ":";
        while (!(tmpQue.empty()))
        {
            string str = tmpQue.front();
            cout << str << " ";
            vec.push_back(str);
            tmpQue.pop();
        }
        cout << endl;
    }
    for (int i = 0; i < n; i++)
    {
        cout << vec.at(i) << " ";
    }
    return 0;
}
