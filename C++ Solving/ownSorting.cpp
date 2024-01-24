#include <iostream>
#include <string>
#include <cmath>
#include <algorithm>
#include <sstream>
#include <stdio.h>
#include <vector>
using namespace std;

int smallSort(const void *p1, const void *p2)
{
    int *a1, *a2;
    a1 = (int *)p1;
    a2 = (int *)p2;

    return *a1 - *a2;
}

void mySwap(char *p1, char *p2, int size)
{

    for (int i = 0; i < size; i++)
    {

        char temp = *(p1 + i);
        *(p1 + i) = *(p2 + i);
        *(p2 + i) = temp;
    }
}

void myQsort(void *__base, size_t __nel, size_t __width,
             int (*_Nonnull compare)(const void *, const void *))
{
    char *arr = (char *)__base;
    int length = (int)__nel;
    int width = (int)__width;

    for (int i = 0; i < (length - 1) * width; i += width)
    {
        for (int j = i + width; j < length * width; j += width)
        {
            int temp = compare(arr + i, arr + j);

            if (temp > 0)
            {
                mySwap(arr + i, arr + j, width);
            }
        }
    }
}

int main()
{
    freopen("input.txt", "r", stdin);

    int arr[5] = {1, 3, -2, -1, 27};
    myQsort(arr, 5, sizeof(int), smallSort);
    for (int i = 0; i < 5; i++)
    {
        cout << arr[i] << " ";
    }

    return 0;
}