#include <iostream>
#include <vector>
using namespace std;

class MinHeap
{
private:
    vector<int> heap;

    void maintainAfterInsert(int index)
    {
        while (index > 0)
        {
            int parentIndex = (index - 1) / 2;
            if (heap[parentIndex] > heap[index])
            {
                swap(heap[parentIndex], heap[index]);
                index = parentIndex;
            }
            else
            {
                break;
            }
        }
    }

    void maintainAfterExtract(int index)
    {
        int leftChild = 2 * index + 1;
        int rightChild = 2 * index + 2;
        int smallest = index;

        if (leftChild < heap.size() && heap[leftChild] < heap[smallest])
        {
            smallest = leftChild;
        }
        if (rightChild < heap.size() && heap[rightChild] < heap[smallest])
        {
            smallest = rightChild;
        }

        if (smallest != index)
        {
            swap(heap[index], heap[smallest]);
            maintainAfterExtract(smallest);
        }
    }

public:
    void insert(int value)
    {
        heap.push_back(value);
        maintainAfterInsert(heap.size() - 1);
    }

    int extractMin()
    {
        if (heap.empty())
        {
            cout << "Empty heap" << endl;
            return -1;
        }

        int minVal = heap[0];
        heap[0] = heap.back();
        heap.pop_back();
        maintainAfterExtract(0);

        return minVal;
    }

    bool isEmpty()
    {
        return heap.empty();
    }
};

int main()
{
    MinHeap myHeap;
    myHeap.insert(5);
    myHeap.insert(7);
    myHeap.insert(8);
    myHeap.insert(9);
    myHeap.insert(1);

    while (!myHeap.isEmpty())
    {
        cout << myHeap.extractMin() << " ";
    }
}