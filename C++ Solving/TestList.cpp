#include <iostream>
#include <string>
using namespace std;

template <typename T>
struct Node
{
    T data;
    Node *next;
    Node *prev;

    Node(const T &val)
    {
        data = val;
        next = nullptr;
        prev = nullptr;
    }
};

template <typename T>
struct DoubleLinkedList
{
private:
    Node<T> *head;
    Node<T> *tail;

public:
    DoubleLinkedList()
    {
        head = nullptr;
        tail = nullptr;
    }

    void append(const T &val)
    {
        Node<T> *newNode = new Node<T>(val);

        if (head == nullptr)
        {
            head = tail = newNode;
        }
        else
        {
            newNode->prev = tail;
            tail->next = newNode;
            tail = newNode;
        }
    }

    void insert(int index, const T &value)
    {
        if (index < 0)
        {
            cout << "Invalid index" << endl;
            return;
        }

        Node<T> *newNode = new Node<T>(value);

        if (index == 0)
        {
            // Insert at the beginning
            newNode->next = head;
            if (head != nullptr)
            {
                head->prev = newNode;
            }
            head = newNode;
            if (tail == nullptr)
            {
                tail = newNode;
            }
        }
        else
        {
            Node<T> *current = head;
            for (int i = 0; i < index - 1 && current != nullptr; ++i)
            {
                current = current->next;
            }

            if (current == nullptr)
            {
                std::cout << "Invalid index. Cannot insert.\n";
                delete newNode;
                return;
            }

            newNode->prev = current;
            newNode->next = current->next;

            if (current->next != nullptr)
            {
                current->next->prev = newNode;
            }

            current->next = newNode;

            if (newNode->next == nullptr)
            {
                tail = newNode;
            }
        }
    }

    void remove(int index)
    {
        if (index < 0)
        {
            cout << "Invalid index. Cannot remove" << endl;
            return;
        }

        if (head == nullptr)
        {
            cout << "List is empty. Cannot remove" << endl;
            return;
        }

        if (index == 0)
        {
            Node<T> *temp = head;
            head = head->next;
            if (head != nullptr)
            {
                head->prev = nullptr;
            }
            delete temp;
            if (head == nullptr)
            {
                tail = nullptr;
            }
        }
        else
        {
            Node<T> *current = head;
            for (int i = 0; i < index && current != nullptr; ++i)
            {
                current = current->next;
            }

            if (current == nullptr)
            {
                std::cout << "Invalid index. Cannot remove.\n";
                return;
            }

            if (current == tail)
            {
                tail = tail->prev;
                if (tail != nullptr)
                {
                    tail->next = nullptr;
                }
            }
            else
            {
                current->prev->next = current->next;
                if (current->next != nullptr)
                {
                    current->next->prev = current->prev;
                }
            }

            delete current;
        }
    }
};

int main()
{
    DoubleLinkedList<int> testLinkList;
    testLinkList.append(10);
    testLinkList.append(20);
    testLinkList.append(30);

    testLinkList.insert(1, 15);
    testLinkList.insert(0, 5);

    testLinkList.remove(2);

    return 0;
}