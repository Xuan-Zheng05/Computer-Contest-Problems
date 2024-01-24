#include <iostream>
#include <string>
#include <stack>
#include <queue>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;
        queue<int> que;
        bool isQueue = true;
        for (int j = 0; j < n; j++)
        {
            int com, num;
            cin >> com >> num;
            if (com == 1)
            {
                que.push(num);
            }
            else
            {
                int queNum = que.front();
                if (queNum != num)
                {
                    isQueue = false;
                }
                que.pop();
            }
        }

        if (isQueue)
        {
            cout << "Queue" << endl;
        }
        else
        {
            cout << "Stack" << endl;
        }
    }
}