#include <iostream>
using namespace std;

int main()
{
    int m = 29;
    int n, o;

    cout << "Adress of m :" << &m << endl;
    cout << "Value of m :" << m << endl;

    int *ab = &m;

    cout << "Now ab is assigned with the value of m" << endl;
    cout << "Adress of pointer ab : " << ab << endl;
    cout << "Content of pointer ab : " << *ab << endl;

    m = 34;

    cout << "The value of m is 34 now" << endl;
    cout << "Adress of pointer ab : " << ab << endl;
    cout << "Content of pointer ab : " << *ab << endl;

    *ab = 7;
    cout << "The pointer ab is assigned to the value of 7 now" << endl;
    cout << "Adress of m :" << &m << endl;
    cout << "Value of m :" << m << endl;
}