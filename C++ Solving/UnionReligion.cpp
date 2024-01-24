#include <iostream>
#include <stdio.h>
using namespace std;

int arr[50000];

int findParent(int node)
{
    if (arr[node] == node)
    {
        return node;
    }
    return arr[node] = findParent(arr[node]);
}

void makeGroup(int a, int b)
{
    int aa = findParent(a);
    int bb = findParent(b);

    if (aa != bb)
    {
        arr[aa] = bb;
    }
}
int main()
{
    freopen("input.txt", "r", stdin);

    int m, n, i, j, u, v, a;
    a = 0;

    while (scanf("%d%d", &n, &m) != EOF)
    {
        a++;
        if (n == 0 && m == 0)
        {
            break;
        }

        for (int i = 0; i < n; i++)
        {
            arr[i] = i;
        }

        for (int i = 0; i < m; i++)
        {
            scanf("%d%d", &u, &v);
            makeGroup(u, v);
        }

        int c = 0;
        for (int i = 0; i < n; i++)
        {
            if (arr[i] == i)
            {
                c++;
            }
        }
        std::cout << "Case " << a << ": " << c << endl;
    }
}