// #include <iostream>
// using namespace std;

// class myStack
// {
// private:
//     int *arr;
//     int capacity;
//     int topIndex;

// public:
//     myStack(int size)
//     {
//         capacity = size;
//         arr = new int[capacity];
//         topIndex = -1;
//     }

//     ~myStack()
//     {
//         delete[] arr;
//     }

//     void push(int value)
//     {
//         if (topIndex < capacity - 1)
//         {
//             topIndex++;
//             arr[topIndex] = value;
//         }
//         else
//         {
//             cout << "Stack overflow!" << endl;
//         }
//     }

//     void pop()
//     {
//         if (topIndex >= 0)
//         {
//             topIndex--;
//         }
//         else
//         {
//             cout << "No element" << endl;
//         }
//     }

// };

// #include <iostream>
// using namespace std;

// class Node
// {
// public:
//     int data;
//     Node *next;

//     Node(int value) : data(value), next(nullptr) {}
// };

// class Stack
// {
// private:
//     Node *topNode;

// public:
//     Stack() : topNode(nullptr) {}

//     ~Stack()
//     {
//         while (!isEmpty())
//         {
//             pop();
//         }
//     }

//     void push(int value)
//     {
//         Node *newNode = new Node(value);
//         newNode->next = topNode;
//         topNode = newNode;
//     }

//     void pop()
//     {
//         if (isEmpty())
//         {
//             cout << "Stack underflow!" << endl;
//             return;
//         }
//         Node *temp = topNode;
//         topNode = topNode->next;
//         delete temp;
//     }

//     int top()
//     {
//         if (isEmpty())
//         {
//             cout << "Stack is empty!" << endl;
//             return -1;
//         }
//         return topNode->data;
//     }

//     bool isEmpty()
//     {
//         return topNode == nullptr;
//     }
// };

// int main()
// {
//     Stack myStack;

//     myStack.push(10);
//     myStack.push(20);
//     myStack.push(30);

//     cout << "Top element: " << myStack.top() << endl;

//     myStack.pop();
//     myStack.pop();

//     if (myStack.isEmpty())
//     {
//         cout << "Stack is empty." << endl;
//     }
//     else
//     {
//         cout << "Stack is not empty." << endl;
//     }

//     return 0;
// }