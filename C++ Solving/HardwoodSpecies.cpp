#include <iostream>
#include <string>
#include <iomanip>
#include <map>
#include <vector>
#include <tuple>

using namespace std;

class Species
{
public:
    string name;
    int count;

    Species(const string &n) : name(n), count(1) {}

    bool operator<(const Species &other) const
    {
        return name > other.name;
    }
};

class MinHeap
{
private:
    vector<Species> heap;

    void heapifyUp(int index)
    {
        while (index > 0)
        {
            int parentIndex = (index - 1) / 2;
            if (heap[parentIndex] < heap[index])
            {
                break;
            }
            swap(heap[parentIndex], heap[index]);
            index = parentIndex;
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
    void insert(const Species &species)
    {
        heap.push_back(species);
        heapifyUp(heap.size() - 1);
    }

    Species popMin()
    {
        if (heap.empty())
        {
            throw runtime_error("Heap is empty.");
        }

        Species minSpecies = heap[0];
        heap[0] = heap.back();
        heap.pop_back();
        heapifyDown(0);

        return minSpecies;
    }

    bool isEmpty() const
    {
        return heap.empty();
    }
};

int main()
{
    map<string, Species> speciesMap;
    string speciesName;
    while (getline(cin, speciesName))
    {
        if (speciesName == "")
            break;
        if (speciesMap.find(speciesName) == speciesMap.end())
        {
            speciesMap[speciesName] = Species(speciesName);
        }
        else
        {
            speciesMap[speciesName].count++;
        }
    }

    MinHeap minHeap;
    for (const auto &pair : speciesMap)
    {
        minHeap.insert(pair.second);
    }

    while (!minHeap.isEmpty())
    {
        Species species = minHeap.popMin();
        cout << species.name << " " << fixed << setprecision(4) << (double)species.count / speciesMap.size() * 100.0 << endl;
    }

    return 0;
}
