// #include <iostream>
// #include <vector>

// using namespace std;

// class UnionFind
// {
// public:
//     vector<int> parent;
//     vector<int> rank;

//     UnionFind(int n)
//     {
//         parent.resize(n);
//         rank.resize(n, 0);
//         for (int i = 0; i < n; ++i)
//         {
//             parent[i] = i;
//         }
//     }

//     int find(int x)
//     {
//         if (x != parent[x])
//         {
//             parent[x] = find(parent[x]);
//         }
//         return parent[x];
//     }

//     void unite(int x, int y)
//     {
//         int rootX = find(x);
//         int rootY = find(y);

//         if (rootX != rootY)
//         {
//             if (rank[rootX] < rank[rootY])
//             {
//                 parent[rootX] = rootY;
//             }
//             else if (rank[rootX] > rank[rootY])
//             {
//                 parent[rootY] = rootX;
//             }
//             else
//             {
//                 parent[rootX] = rootY;
//                 rank[rootY]++;
//             }
//         }
//     }
// };

// int computeHeight(const string &directions, int &maxHeight)
// {
//     UnionFind uf(directions.size() + 1);

//     int height = 0;
//     for (char dir : directions)
//     {
//         if (dir == 'd')
//         {
//             height++;
//         }
//         else
//         {
//             maxHeight = max(maxHeight, height);
//             height--;
//         }
//     }

//     return maxHeight;
// }

// int main()
// {
//     freopen("input.txt", "r", stdin);
//     string directions;
//     int treeNumber = 1;

//     while (true)
//     {
//         cin >> directions;
//         if (directions[0] == '#')
//         {
//             break;
//         }

//         int beforeConversionHeight = 0;
//         int afterConversionHeight = 0;

//         beforeConversionHeight = computeHeight(directions, afterConversionHeight);

//         cout << "Tree " << treeNumber << ": " << beforeConversionHeight << " => " << afterConversionHeight << endl;

//         treeNumber++;
//     }

//     return 0;
// }
// // freopen("input.txt", "r", stdin);

#include <iostream>
#include <cmath>
#include <stack>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    int cnt = 0;
    char t[1000000];
    while (cin >> t)
    {
        if (t[0] == '#')
            break;
        int nh = 0, h = 0, nh2 = 0, h2 = 0;
        stack<int> now;
        now.push(0);
        for (int i = 0; t[i] != '\0'; i++)
        {
            if (t[i] == 'd')
            {
                nh++;
                nh2++;
                now.push(nh2);
            }
            else
            {
                nh--;
                nh2 = now.top();
                now.pop();
            }

            h2 = max(h2, nh2);
            h = max(h, nh);
        }
        cout << "Tree " << ++cnt << ": " << h << " => " << h2 << endl;
    }

    return 0;
}