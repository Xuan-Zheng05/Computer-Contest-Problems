#include <iostream>
using namespace std;

struct Treenode
{
    int data;
    Treenode *right;
    Treenode *left;

    Treenode(int val)
    {
        data = val;
        left = nullptr;
        right = nullptr;
    }
};

void insert(Treenode *&root, int val)
{
    if (root == nullptr)
    {
        root = new Treenode(val);
        return;
    }
    if (val < root->data)
    {
        insert(root->left, val);
    }
    else if (val > root->data)
    {
        insert(root->right, val);
    }
}

bool checkBST(Treenode *root, int minValue, int maxValue)
{
    if (root == nullptr)
    {
        return true;
    }

    if (root->data <= minValue || root->data >= maxValue)
        return false;

    return checkBST(root->left, minValue, root->data) && checkBST(root->right, root->data, maxValue);
}

int main()
{
    Treenode *root = nullptr;

    insert(root, 5);
}