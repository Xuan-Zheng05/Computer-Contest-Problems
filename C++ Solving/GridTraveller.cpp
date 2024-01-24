#include <iostream>
#include <stdio.h>
#include <memory.h>
#include <cmath>
#include <iomanip>
using namespace std;

int memo[1000][1000];
int travel(int x, int y)
{
    if (memo[x][y] != 0)
    {
        memo[y][x] = memo[x][y];
        return memo[x][y];
    }
    if (memo[y][x] != 0)
    {
        memo[x][y] = memo[y][x];
        return memo[y][x];
    }
    if (x == 1 && y == 1)
    {
        return 1;
    }
    if (x == 0 || y == 0)
    {
        return 0;
    }

    memo[x][y] = travel(x - 1, y) + travel(x, y - 1);
    return memo[x][y];
}
int main()
{
    cout << travel(3, 3);
    return 0;
}