#include <iostream>
using namespace std;

int main()
{
    int m = 5, n = 6;

    int *a = &m;
    int *b = &n;

    int sum = *a + *b;

    cout << sum;

    return 0;
}