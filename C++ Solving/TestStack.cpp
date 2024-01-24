#include <iostream>
#include <string>
using namespace std;

class Stack
{
private:
    int arr[100];
    int top;

public:
    Stack()
    {
        top = -1;
    }

    void push(int val)
    {
        if (top >= 99)
        {
            cout << "Stack overflow" << endl;
            return;
        }
        top++;
        arr[top] = val;
    }

    int pop()
    {
        if (top > -1)
        {
            int val = arr[top];
            top--;
            return val;
        }
        else
        {
            cout << "Nothing in stack" << endl;
            return -1;
        }
    }

    bool isEmpty()
    {
        if (top < 0)
        {
            return true;
        }
        return false;
    }
};

int main()
{
    freopen("input.txt", "r", stdin);
    Stack testStack;
    testStack.push(3);
    testStack.push(4);
    testStack.push(5);
    cout << testStack.isEmpty() << endl;
    cout << testStack.pop() << endl;
    cout << testStack.pop() << endl;
    cout << testStack.pop() << endl;
    cout << testStack.pop() << endl;
    cout << testStack.isEmpty() << endl;
    return 0;
}
