#include <iostream>
#include <string>
#include <stack>
#include <vector>
using namespace std;

int main()
{
    string str = "9+3+6/(1+2+3)";
    vector<char> polish;
    stack<char> operation;
    for (int i = 0; i < str.length(); i++)
    {
        char letter = str[i];
        if (letter == '+' || letter == '-' || letter == '*' || letter == '/' || letter == '(')
        {
            operation.push(letter);
        }

        else if (letter == ')')
        {
            operation.pop();
            while (!operation.empty())
            {
                if (letter == '(')
                {
                    break;
                }
                else
                {
                    char out = operation.top();
                    polish.push_back(out);
                    operation.pop();
                }
            }
        }
        else
        {
            polish.push_back(letter);
            while (!operation.empty())
            {
                char out = operation.top();
                if (out == '(')
                {
                    break;
                }
                else
                {
                    polish.push_back(out);
                }
                operation.pop();
            }
        }
    }

    int answer = 0;
    stack<int> nums;
    for (int i = 0; i < polish.size(); i++)
    {
        if (polish.at(i) == '+' || polish.at(i) == '-' || polish.at(i) == '*' || polish.at(i) == '/')
        {
            int op2 = nums.top();
            nums.pop();
            int op1 = nums.top();
            nums.pop();

            if (polish.at(i) == '+')
            {
                nums.push(op1 + op2);
            }
            else if (polish.at(i) == '-')
            {
                nums.push(op1 - op2);
            }
            else if (polish.at(i) == '*')
            {
                nums.push(op1 * op2);
            }
            else if (polish.at(i) == '/')
            {
                nums.push(op1 / op2);
            }
        }
        else
        {
            nums.push(polish.at(i) - '0');
        }
    }
    cout << nums.top();
}