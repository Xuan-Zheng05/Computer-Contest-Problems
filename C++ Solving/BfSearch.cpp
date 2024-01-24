#include <iostream>
#include <cstring>
#include <queue>
using namespace std;

int n, k;
const int MAXN = 100000;
int visited[MAXN + 10];

struct Step
{
    int x;
    int steps;
    Step(int xx, int s) : x(xx), steps(s) {}
};

queue<Step> q;

int main()
{
    freopen("input.txt", "r", stdin);
    cin >> n >> k;
    memset(visited, 0, sizeof(visited));
    visited[n] = 1;
    q.push({n, 0});

    while (!q.empty())
    {
        Step tmp = q.front();
        q.pop();

        if (tmp.x == k)
        {
            cout << tmp.steps;
            return 0;
        }
        if (tmp.x + 1 <= MAXN && !visited[tmp.x + 1])
        {
            q.push({tmp.x + 1, tmp.steps + 1});
            visited[tmp.x + 1] = 1;
        }
        if (tmp.x - 1 >= 0 && !visited[tmp.x - 1])
        {
            q.push({tmp.x - 1, tmp.steps + 1});
            visited[tmp.x - 1] = 1;
        }
        if (tmp.x * 2 >= 0 && tmp.x * 2 <= MAXN && !visited[tmp.x * 2])
        {
            q.push({tmp.x * 2, tmp.steps + 1});
            visited[tmp.x * 2] = 1;
        }
    }
    return 0;
}