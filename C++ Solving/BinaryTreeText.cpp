#include <iostream>
#include <string>
#include <stack>
#include <vector>
using namespace std;

struct TreeNode
{
    char data;
    TreeNode *left;
    TreeNode *right;

    TreeNode(char val)
    {
        data = val;
        right = nullptr;
        left = nullptr;
    }
};

TreeNode *buildTree(const vector<string> &lines)
{
    TreeNode *root = nullptr;
    stack<TreeNode *> nodeStack;
    int prevIndent = -1;

    for (const string &line : lines)
    {
        int indent = 0;
        while (line[indent] == '-')
        {
            indent++;
        }

        while (nodeStack.size() > indent)
        {
            nodeStack.pop();
        }

        TreeNode *newNode;
        if (line.back() == '*')
        {
            newNode = new TreeNode(line[indent - 1]);
            line.back(); // note
        }
        else
        {
            newNode = new TreeNode(line.back());
        }

        if (!nodeStack.empty())
        {
            if (nodeStack.top()->left == nullptr)
            {
                nodeStack.top()->left = newNode;
            }
            else
            {
                nodeStack.top()->right = newNode;
            }
        }
        else
        {
            root = newNode;
        }

        nodeStack.push(newNode);
        prevIndent = indent;
    }

    return root;
}

void preorderTraversal(TreeNode *root)
{
    if (root == nullptr)
        return;
    if (root->data != '-')
    {
        cout << root->data;
    }
    preorderTraversal(root->left);
    preorderTraversal(root->right);
}

void postorderTraversal(TreeNode *root)
{
    if (root == nullptr)
        return;
    postorderTraversal(root->left);
    postorderTraversal(root->right);
    if (root->data != '-')
    {
        cout << root->data;
    }
}

void inorderTraversal(TreeNode *root)
{
    if (root == nullptr)
        return;
    inorderTraversal(root->left);
    if (root->data != '-')
    {
        cout << root->data;
    }
    inorderTraversal(root->right);
}

int main()
{
    freopen("input.txt", "r", stdin);
    int n;
    cin >> n;

    for (int i = 0; i < n; i++)
    {
        vector<string> lines;
        string line;
        while (true)
        {
            getline(cin, line);
            if (line == "0")
                break;
            lines.push_back(line);
        }

        TreeNode *root = buildTree(lines);

        preorderTraversal(root);
        cout << endl;
        postorderTraversal(root);
        cout << endl;
        inorderTraversal(root);
        cout << endl;

        if (i < n - 1)
        {
            cout << endl;
        }
    }
}
