#include <iostream>
#include <queue>
#include <vector>
using namespace std;

struct Node
{
    int value;
    Node *right;
    Node *left;
    bool isLeaf;

    Node(int val)
    {
        value = val;
        right = nullptr;
        left = nullptr;
        isLeaf = false;
    }
    bool operator<(const Node *a)
    {
        return this->value > a->value;
    }
};

struct compair
{
    bool operator()(const Node *a, const Node *b)
    {
        return a->value > b->value;
    }
};

int traversal(Node *a, int deep)
{
    if (a == nullptr)
    {
        return 0;
    }
    if (a->isLeaf)
    {
        return a->value * deep;
    }
    return (traversal(a->left, deep + 1) + traversal(a->right, deep + 1));
}

int main()
{
    freopen("input.txt", "r", stdin);
    int t;
    cin >> t;
    for (int i = 0; i < t; i++)
    {
        int n;
        cin >> n;
        priority_queue<Node *, vector<Node *>, compair> pq;
        for (int j = 0; j < n; j++)
        {
            int num;
            cin >> num;
            Node *b = new Node(num);
            b->isLeaf = true;

            pq.push(b);
        }
        while (pq.size() > 1)
        {
            Node *a = pq.top();
            pq.pop();
            Node *b = pq.top();
            pq.pop();

            Node *c = new Node(a->value + b->value);
            c->left = a;
            c->right = b;
            pq.push(c);
        }

        int deep = traversal(pq.top(), 0);

        cout << deep << endl;
    }
}