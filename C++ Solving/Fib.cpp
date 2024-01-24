#include <iostream>
#include <stdio.h>
#include <memory.h>
#include <cmath>
#include <iomanip>
using namespace std;

int memo[1000];
int fib(int n)
{
    if (n <= 2)
    {
        return 1;
    }

    if (memo[n] != 0)
    {
        return memo[n];
    }
    else
    {
        memo[n] = fib(n - 1) + fib(n - 2);
        return memo[n];
    }
}
int main()
{
    cout << fib(40) << endl;
    cout << fib(30);
}