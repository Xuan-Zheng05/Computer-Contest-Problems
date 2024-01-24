#include <iostream>
#include <string>
using namespace std;

class Queue
{
private:
    int arr[100];
    int front, rear;

public:
    Queue()
    {
        front = -1;
        rear = -1;
    }

    bool isEmpty()
    {
        if (front == -1)
        {
            return true;
        }
        return false;
    }

    bool isFull()
    {
        if (rear == 99)
        {
            return true;
        }
        return false;
    }

    void push(int val)
    {
        if (isFull())
        {
            cout << "Queue is full" << endl;
            return;
        }

        if (isEmpty())
        {
            front = rear = 0;
        }
        else
        {
            rear++;
        }

        arr[rear] = val;
    }
    int pop()
    {
        if (isEmpty())
        {
            cout << "Queue is empty" << endl;
            return -1;
        }

        int value = arr[front];

        if (front == rear)
        {
            front = rear = -1;
        }
        else
        {
            front++;
        }

        return value;
    }
};

int main()
{
    Queue myQueue;
    myQueue.push(17);
    myQueue.push(20);

    cout << myQueue.pop() << endl;

    myQueue.push(35);
    cout << myQueue.isEmpty();
}