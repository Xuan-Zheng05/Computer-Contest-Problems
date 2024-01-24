#include <iostream>
#include <vector>
using namespace std;

class MinHeap
{
private:
    vector<int> heap;

    void heapifyUp(int index)
    {
        int parent = (index - 1) / 2;
        while (index > 0 && heap[index] < heap[parent])
        {
            std::swap(heap[index], heap[parent]);
            index = parent;
            parent = (index - 1) / 2;
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
            std::swap(heap[index], heap[smallest]);
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
            cout << "Heap is empty!" << endl;
            return -1;
        }

        int minValue = heap[0];
        heap[0] = heap.back();
        heap.pop_back();
        heapifyDown(0);

        return minValue;
    }

    void printHeap()
    {
        for (int value : heap)
        {
            cout << value << " ";
        }
        cout << std::endl;
    }
};

int main()
{
    freopen("input.txt", "r", stdin);
    int t;
    cin >> t;

    for (int i = 0; i < t; i++)
    {
        MinHeap myHeap;
        int m;
        cin >> m;
        for (int j = 0; j < m; j++)
        {
            int n;
            cin >> n;
            if (n == 1)
            {
                int num;
                cin >> num;
                myHeap.insert(num);
            }
            else if (n == 2)
            {
                cout << myHeap.extractMin() << endl;
            }
        }
    }
}