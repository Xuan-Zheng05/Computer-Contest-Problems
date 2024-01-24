#include <iostream>
#include <bitset>
#include <cstring>
#include <stack>
#include <set>
#include <unordered_set>
#include <queue>
using namespace std;

int startNum, endNum;

struct Node
{
    string str;
    string path;
};
bool canSolve()
{
    int solveNum = startNum;
    int startLarger = 0, endLarger = 0;
    while (solveNum > 0)
    {
        int currDigit = solveNum % 10;
        solveNum /= 10;

        int nextNum = solveNum;

        while (nextNum > 0)
        {
            int nextDigit = nextNum % 10;
            if (currDigit > nextDigit)
            {
                startLarger++;
            }
            nextNum /= 10;
        }
    }

    solveNum = endNum;
    while (solveNum > 0)
    {
        int currDigit = solveNum % 10;
        solveNum /= 10;

        int nextNum = solveNum;

        while (nextNum > 0)
        {
            int nextDigit = nextNum % 10;
            if (currDigit > nextDigit)
            {
                endLarger++;
            }
            nextNum /= 10;
        }
    }
    if (startLarger == endLarger)
    {
        return true;
    }
    return false;
}

int main()
{
    freopen("input.txt", "r", stdin);
    unordered_set<string> se;
    char mode[4] = {'u', 'l', 'r', 'd'};
    int start[9];

    for (int i = 0; i < 9; i++)
    {
        char c;
        cin >> c;
        if (c == 'x')
        {
            start[i] = 0;
        }
        else
        {
            start[i] = c - '0';
        }
    }

    int v = 0;
    int sumGoal = 0;
    for (int i = 0; i < 9; i++)
    {
        if (start[i] == 0)
            continue;
        for (int j = 0; j < i; j++)
        {
            if (start[j] == 0)
                continue;
            if (start[i] > start[j])
                v++;
        }
        cout << "";
    }

    for (int i = 0; i < 9; i++)
    {
        sumGoal += i - 1;
    }

    if (v % 2 != 0)
    {
        cout << "unsolvable" << endl;
        return 0;
    }

    queue<Node> q;
    string s = "";
    for (int i = 0; i < 9; i++)
    {
        s += (start[i] + '0');
    }
    q.push({s, ""});
    se.insert(s);

    while (!q.empty())
    {
        Node n = q.front();
        q.pop();

        if (n.str == "123456780")
        {
            cout << n.path << endl;
            return 0;
        }

        int p = 0;
        for (int i = 0; i < 9; i++)
        {
            if (n.str[i] == '0')
            {
                p = i;
                break;
            }
        }
        //{'u','l','r','d'};
        for (int i = 0; i < 4; i++)
        {
            string o = n.str;
            if (i == 0)
            {
                if (p >= 3)
                {
                    char s = o[p - 3];
                    o[p] = s;
                    o[p - 3] = '0';
                }
            }
            if (i == 1)
            {
                if (p % 3 != 0)
                {
                    char s = o[p - 1];
                    o[p] = s;
                    o[p - 1] = '0';
                }
            }
            if (i == 2)
            {
                if (p % 3 != 2)
                {
                    char s = o[p + 1];
                    o[p] = s;
                    o[p + 1] = '0';
                }
            }
            if (i == 3)
            {
                if (p <= 5)
                {
                    char s = o[p + 3];
                    o[p] = s;
                    o[p + 3] = '0';
                }
            }

            if (o != n.str)
            {
                auto it = se.find(o);
                if (it == se.end())
                {
                    se.insert(o);
                    q.push({o, n.path + mode[i]});
                }
            }
        }
    }
}