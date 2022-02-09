#include <iostream>
using namespace std;

int main()
{
    int button, number;
    char list[] = " ABCDE";
    while(cin >> button >> number && button!=4)
    {
        if(button == 1)
        {
            for(int i=1; i<=number; i++)
            {
                char tmp = list[1];
                for(int j=1; j<5; j++)
                    list[j] = list[j+1];
                list[5]= tmp;
            }
        }
        else if (button == 2)
        {
            for(int i=1; i<=number; i++)
            {
                char tmp = list[5];
                for(int j=5; j>1; j--)
                    list[j] = list[j-1];
                list[1]= tmp;
            }
        }
        else if (button == 3)
        {
            for(int i=1; i<=number; i++){
                char tmp = list[1];
                list[1] = list[2];
                list[2] = tmp;
            }
        }
    }

    for(int i=1; i<=5; i++)
        cout << list[i] <<" ";

    return 0;
}