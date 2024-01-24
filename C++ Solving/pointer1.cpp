// Pointer : Show the basic declaration of pointer :
// -------------------------------------------------------
//  Here is m=10, n and o are two integer variable and *z is an integer

//  z stores the address of m  = 0x7ffd40630d44

//  *z stores the value of m = 10

//  &m is the address of m = 0x7ffd40630d44

//  &n stores the address of n = 0x7ffd40630d48

//  &o  stores the address of o = 0x7ffd40630d4c

//  &z stores the address of z = 0x7ffd40630d50

#include <iostream>
using namespace std;

int main()
{
    int m = 10;
    int n, o;

    int *z = &m;
    cout << "Pointer : Show the basic declaration of pointer :" << endl;
    cout << "z stores the address of m = " << z << endl;
    cout << "*z stores the value of m = " << *z << endl;
    cout << "&m is the adress of m = " << &m << endl;
    cout << "&n stores the adress of n = " << &n << endl;
    cout << "&o is the adress of o = " << &o << endl;
    cout << "&z is the adress of z = " << &z << endl;
}