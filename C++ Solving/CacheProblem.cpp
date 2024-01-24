#include <iostream>
#include <vector>
#include <map>
#include <string>
#include <algorithm>
#include <set>
#include <cassert>
using namespace std;

struct Node
{
    Node *next;
    Node *prev;
    int value;
    int key;
    Node(Node *p, Node *n, int k, int val) : prev(p), next(n), key(k), value(val){};
    Node(int k, int val) : prev(NULL), next(NULL), key(k), value(val){};
};

class Cache
{

protected:
    map<int, Node *> mp;            // map the key to the node in the linked list
    int cp;                         // capacity
    Node *tail;                     // double linked list tail pointer
    Node *head;                     // double linked list head pointer
    virtual void set(int, int) = 0; // set function
    virtual int get(int) = 0;       // get function
};

class LRUCache : public Cache
{

public:
    LRUCache(int cap)
    {
        cp = cap;
        head = nullptr;
        tail = nullptr;
    }
    void set(int key, int value)
    {
        Node *addNod = new Node(key, value);

        if (head == nullptr)
        {
            head = addNod;
            tail = addNod;
            head->next = nullptr;
            head->prev = nullptr;
        }
        else
        {
            addNod->next = head;
            head->prev = addNod;
            head = addNod;
            Node *point = addNod->next;

            while (point)
            {
                if (point->key == addNod->key)
                {
                    if (point->next)
                    {
                        point->next->prev = point->prev;
                        point->prev->next = point->next;
                    }
                    else
                    {
                        point->prev->next = nullptr;
                    }
                    break;
                }
                point = point->next;
            }
        }
        mp.insert({key, addNod});
        if (mp.size() > cp)
        {
            Node *n = tail;
            mp.erase(n->key);
            tail = tail->prev;
            tail->next = nullptr;
        }
    }

    int get(int a)
    {
        auto itr = mp.find(a);
        if (itr == mp.end())
        {
            return -1;
        }
        else
        {
            Node *n = itr->second;
            return n->value;
        }
    }
};
int main()
{
    freopen("input.txt", "r", stdin);
    int n, capacity, i;
    cin >> n >> capacity;
    LRUCache l(capacity);
    for (i = 0; i < n; i++)
    {
        string command;
        cin >> command;
        if (command == "get")
        {
            int key;
            cin >> key;
            cout << l.get(key) << endl;
        }
        else if (command == "set")
        {
            int key, value;
            cin >> key >> value;
            l.set(key, value);
        }
    }
    return 0;
}
