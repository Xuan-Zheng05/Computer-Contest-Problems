#include <iostream>
#include <vector>
#include <queue>
#include <climits>

using namespace std;

#define INF INT_MAX

class Graph
{
public:
    int vertices;
    vector<vector<pair<int, int>>> adjList;

    Graph(int V)
    {
        vertices = V;
        adjList.resize(V);
    }

    void addEdge(int u, int v, int w)
    {
        adjList[u].emplace_back(v, w);
        adjList[v].emplace_back(u, w); // For undirected graph
    }

    void dijkstra(int start)
    {
        vector<int> distance(vertices, INF);
        distance[start] = 0;

        priority_queue<pair<int, int>, vector<pair<int, int>>, greater<pair<int, int>>> pq;
        pq.push({0, start});

        while (!pq.empty())
        {
            int u = pq.top().second;
            pq.pop();

            for (const auto &neighbor : adjList[u])
            {
                int v = neighbor.first;
                int weight = neighbor.second;

                if (distance[u] != INF && distance[u] + weight < distance[v])
                {
                    distance[v] = distance[u] + weight;
                    pq.push({distance[v], v});
                }
            }
        }

        // Print the shortest distances from the start node
        cout << "Shortest distances from node " << start << ":\n";
        for (int i = 0; i < vertices; ++i)
        {
            cout << "To node " << i << ": ";
            if (distance[i] == INF)
            {
                cout << "INF\n";
            }
            else
            {
                cout << distance[i] << "\n";
            }
        }
    }
};

int main()
{
}