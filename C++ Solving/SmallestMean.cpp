#include <iostream>
#include <stdio.h>
#include <cmath>
#include <iomanip>
#include <memory.h>
using namespace std;

int arr[9][9];
int sum[9][9];
int res[15][9][9][9][9];

int calSum(int x1, int y1, int x2, int y2)
{
    return sum[x2][y2] - sum[x2][y1 - 1] - sum[x1 - 1][y2] + sum[x1 - 1][y1 - 1];
}

int find(int n, int x1, int y1, int x2, int y2)
{
    int MIN = 10000000;
    if (res[n][x1][y1][x2][y2] != -1)
    {
        return res[n][x1][y1][x2][y2];
    }
    if (n == 1)
    {
        int ans = calSum(x1, y1, x2, y2) * calSum(x1, y1, x2, y2);
        res[n][x1][y1][x2][y2] = ans;
        return ans;
    }

    for (int i = x1; i < x2; i++)
    {

        int temp1 = calSum(i + 1, y1, x2, y2);
        int temp2 = calSum(x1, y1, i, y2);
        int ans = min(find(n - 1, x1, y1, i, y2) + temp1 * temp1, find(n - 1, i + 1, y1, x2, y2) + temp2 * temp2);
        if (MIN > ans)
        {
            MIN = ans;
        }
    }
    for (int i = y1; i < y2; i++)
    {
        int temp1 = calSum(x1, i + 1, x2, y2);
        int temp2 = calSum(x1, y1, x2, i);
        int ans = min(find(n - 1, x1, y1, x2, i) + temp1 * temp1, find(n - 1, x1, i + 1, x2, y2) + temp2 * temp2);
        if (MIN > ans)
            MIN = ans;
    }
    res[n][x1][y1][x2][y2] = MIN;
    return MIN;
}
int main()
{
    freopen("input.txt", "r", stdin);
    memset(res, -1, sizeof(res));
    int n;
    cin >> n;

    for (int i = 1; i < 9; i++)
    {
        int rowsum = 0;
        for (int j = 1; j < 9; j++)
        {
            cin >> arr[i][j];
            rowsum += arr[i][j];
            sum[i][j] += sum[i - 1][j] + rowsum;
        }
    }
    double result = find(n, 1, 1, 8, 8) - double(sum[8][8] * sum[8][8]) / n;
    cout << setiosflags(ios::fixed) << setprecision(3) << sqrt(result / n) << endl;
    // cout << setprecision(4) << sqrt(result / n);

    // double result = n * fun(n, 1, 1, 8, 8) - sum[8][8] * sum[8][8];

    return 0;
}