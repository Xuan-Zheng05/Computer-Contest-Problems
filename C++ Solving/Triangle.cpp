#include <iostream>
#include <stdio.h>
#include <memory.h>
#include <cmath>
#include <iomanip>
using namespace std;

int triangle[101][101];
int maxSum[101][101];
int n;
int Sum(int i, int j)
{
    if (maxSum[i][j] != -1)
    {
        return maxSum[i][j];
    }

    if (i == n)
    {
        maxSum[i][j] = triangle[i][j];
    }
    else
    {
        int x = Sum(i + 1, j);
        int y = Sum(i + 1, j + 1);

        maxSum[i][j] = max(x, y) + triangle[i][j];
    }
    return maxSum[i][j];
}
int main()
{
    freopen("input.txt", "r", stdin);
    cin >> n;

    int counter = 1;
    for (int i = 1; i <= n; i++)
    {
        for (int j = 1; j <= counter; j++)
        {
            cin >> triangle[i][j];
            maxSum[i][j] = -1;
        }
        counter++;
    }
    cout << Sum(1, 1) << endl;
}