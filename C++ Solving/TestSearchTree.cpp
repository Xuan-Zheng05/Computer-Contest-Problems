#include <iostream>
using namespace std;

struct TreeNode
{
    int data;
    TreeNode *left;
    TreeNode *right;

    TreeNode(int value)
    {
        data = value;
        left = nullptr;
        right = nullptr;
    }
};

struct BinarySearchTree
{
private:
    TreeNode *root;

    TreeNode *insert(TreeNode *root, int value)
    {
        if (root == nullptr)
        {
            return new TreeNode(value);
        }

        if (value < root->data)
        {
            root->left = insert(root->left, value);
        }
        else if (value > root->data)
        {
            root->right = insert(root->right, value);
        }
        return root;
    }

    TreeNode *remove(TreeNode *root, int value)
    {
        if (root == nullptr)
        {
            return root;
        }

        if (value < root->data)
        {
            root->left = remove(root->left, value);
        }
        else if (value > root->data)
        {
            root->right = remove(root->right, value);
        }
        else
        {
            if (root->left == nullptr)
            {
                TreeNode *temp = root->right;
                delete root;
                return temp;
            }
            else if (root->right == nullptr)
            {
                TreeNode *temp = root->left;
                delete root;
                return temp;
            }

            TreeNode *temp = findMin(root->right);
            root->data = temp->data;
            root->right = remove(root->right, temp->data);
        }

        return root;
    }

    TreeNode *findMin(TreeNode *node)
    {
        while (node->left != nullptr)
        {
            node = node->left;
        }
        return node;
    }

public:
    BinarySearchTree()
    {
        root = nullptr;
    }

    void insert(int value)
    {
        root = insert(root, value);
    }

    void remove(int value)
    {
        root = remove(root, value);
    }
};
int main()
{
    BinarySearchTree testTree;

    testTree.insert(15);
    testTree.insert(30);
    testTree.insert(5);
    testTree.insert(65);
}