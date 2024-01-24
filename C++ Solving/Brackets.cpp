#include <iostream>
#include <string>
#include <stack>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    string expr;
    cin >> expr;
    stack<char> temp;
    for (int i = 0; i < expr.length(); i++)
    {
        if (temp.empty())
        {
            temp.push(expr[i]);
        }
        else if ((temp.top() == '(' && expr[i] == ')') || (temp.top() == '{' && expr[i] == '}') || (temp.top() == '[' && expr[i] == ']'))
        {
            temp.pop();
        }
        else
        {
            temp.push(expr[i]);
        }
    }
    if (temp.empty())
    {
        cout << "Yes";
    }
    else
    {
        cout << "No";
    }
}