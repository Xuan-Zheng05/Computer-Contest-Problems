#include <iostream>
#include <vector>

using namespace std;

class MinHeap
{
private:
    vector<int> heap;

    void heapifyUp(int index)
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

    void heapifyDown(int index)
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
            heapifyDown(smallest);
        }
    }

public:
    void insert(int value)
    {
        heap.push_back(value);
        heapifyUp(heap.size() - 1);
    }

    int extractMin()
    {
        if (heap.empty())
        {
            throw runtime_error("Heap is empty.");
        }

        int minVal = heap[0];
        heap[0] = heap.back();
        heap.pop_back();
        heapifyDown(0);

        return minVal;
    }

    bool isEmpty() const
    {
        return heap.empty();
    }
};

int main()
{
    MinHeap minHeap;

    minHeap.insert(3);
    minHeap.insert(1);
    minHeap.insert(7);
    minHeap.insert(5);
    minHeap.insert(4);

    cout << "Extracted elements in ascending order: ";
    while (!minHeap.isEmpty())
    {
        cout << minHeap.extractMin() << " ";
    }
    cout << endl;

    return 0;
}
