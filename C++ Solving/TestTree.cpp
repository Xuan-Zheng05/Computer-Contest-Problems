#include <iostream>
#include <string>
using namespace std;

struct Node
{
    int value;
    Node *left;
    Node *right;
};

void inOrder(Node *node)
{
    if (node)
    {
        inOrder(node->left);
        cout << node->value << " ";
        inOrder(node->right);
    }
}

void preOrder(Node *node)
{
    if (node)
    {
        cout << node->value << " ";
        preOrder(node->left);
        preOrder(node->right);
    }
}

void postOrder(Node *node)
{
    if (node)
    {
        postOrder(node->left);
        postOrder(node->right);
        cout << node->value << " ";
    }
}

int main()
{
    return 0;
}