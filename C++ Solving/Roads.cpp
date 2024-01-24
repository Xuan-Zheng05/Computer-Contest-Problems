#include <iostream>
#include <vector>
#include <cstring>
using namespace std;
int K, N, R, S, D, L, T;
struct Road
{
    int destination, length, toll;
};
vector<vector<Road>> cityMap(110);
int minLen = 1 << 30;
int totalLen;
int totalCost;
int visited[110];
int minL[110][10100];

void Dfs(int s)
{
    if (s == N)
    {
        minLen = min(minLen, totalLen);
        return;
    }
    for (int i = 0; i < cityMap[s].size(); ++i)
    {
        int d = cityMap[s][i].destination;
        if (!visited[d])
        {
            int cost = totalCost + cityMap[s][i].toll;
            if (cost > K)
            {
                continue;
            }
            if (totalLen + cityMap[s][i].length >= minLen || totalLen + cityMap[s][i].length >= minL[d][cost])
            {
                continue;
            }
            totalLen += cityMap[s][i].length;
            totalCost += cityMap[s][i].toll;
            minL[d][cost] = totalLen;
            visited[d] = 1;
            Dfs(d);
            visited[d] = 0;
            totalCost -= cityMap[s][i].toll;
            totalLen -= cityMap[s][i].length;
        }
    }
}

int main()
{
    freopen("input.txt", "r", stdin);
    cin >> K >> N >> R;
    for (int i = 0; i < R; ++i)
    {
        int s;
        Road r;
        cin >> s >> r.destination >> r.length >> r.toll;
        if (s != r.destination)
            cityMap[s].push_back(r);
    }
    for (int i = 0; i < 110; ++i)
    {
        for (int j = 0; j < 10100; ++j)
            minL[i][j] = 1 << 30;
    }
    memset(visited, 0, sizeof(visited));
    totalLen = 0;
    totalCost = 0;
    visited[1] = 1;
    minLen = 1 << 30;
    Dfs(1);
    if (minLen < (1 << 30))
        cout << minLen << endl;
    else
        cout << "-1" << endl;
}