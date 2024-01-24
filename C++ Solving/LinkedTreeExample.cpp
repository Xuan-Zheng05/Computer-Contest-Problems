#include <iostream>
#include <string>
#include <cmath>
#include <algorithm>
#include <sstream>
#include <stdio.h>
#include <vector>
using namespace std;

class Node
{
public:
    int data;
    Node *next;
};

Node *root = nullptr;
Node *current = nullptr;

void insertFirst(int val)
{
    Node *newNode = new Node;
    newNode->data = val;
    if (root == nullptr)
    {
        newNode->next = nullptr;
        root = newNode;
    }
    else
    {
        newNode->next = root;
        root = newNode;
    }
}

void insertLast(int val)
{
    Node *newNode = new Node;
    newNode->data = val;
    newNode->next = nullptr;
    if (root == nullptr)
    {
        root = newNode;
        current = root;
    }
    else
    {
        Node *node = current;
        current = newNode;
        node->next = newNode;
    }
}

void clearNodes()
{
    Node *temp = root;
    while (temp->next != nullptr)
    {
        delete temp;
        temp = temp->next;
    }
    delete temp;
}

void deleteNode(int val)
{
    Node *currNode = root;
    Node *prevNode = nullptr;

    while (currNode != nullptr)
    {
        if (currNode->data == val)
        {
            if (prevNode != nullptr)
            {
                prevNode->next = currNode->next;
            }
            else
            {
                root = currNode->next;
            }
            Node *temp = currNode;
            currNode = currNode->next;
            delete temp;
        }
        else
        {
            prevNode = currNode;
            currNode = currNode->next;
        }
    }
}

void display()
{
    Node *temp = root;
    while (temp->next != nullptr)
    {
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << temp->data;
}

int main()
{
    freopen("input.txt", "r", stdin);
    int n, num;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        cin >> num;
        insertLast(num);
    }
    int deleteNum;
    cin >> deleteNum;
    deleteNode(deleteNum);
    display();
    return 0;
}