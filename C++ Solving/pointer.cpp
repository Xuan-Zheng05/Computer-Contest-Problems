#include <iostream>
using namespace std;

int main()
{
    const int a = 78;
    const int b = 28;
    int c = 18;

    const int *pi = &a;

    int *pi2;
    pi2 = &c;
    *pi2 = 35;
    cout << c;
    pi = &b;
    pi = &c;
}