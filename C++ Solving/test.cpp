#include <iostream>
#include <string>
#include <list>
#include <vector>
using namespace std;

int main()
{
    list<int> list1 = {1, 3, 5, 3};
    list1.unique();
    list<int> list2 = {3, 6, 1};

    list1.merge(list2);

    for (int num : list1)
    {
        cout << num << " ";
    }
    return 0;
}