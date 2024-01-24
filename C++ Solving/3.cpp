#include <iostream>
#include <string>
using namespace std;

int main()
{
    freopen("input.txt", "r", stdin);
    float A = 0, B = 0, C = 0;
    float persons[] = {0, 0, 0, 0};
    for (int i = 0; i < 3; i++)
    {
        int person, times;
        cin >> person;
        cin >> times;

        for (int k = 0; k < times; k++)
        {
            char type;
            float num;
            cin >> type;
            cin >> num;

            if (type == 'A')
            {
                A += num;
            }
            else if (type == 'B')
            {
                B += num;
            }
            else if (type == 'C')
            {
                C += num;
            }

            persons[person] += num;
        }
    }
    for (int i = 1; i <= 3; i++)
    {
        cout << i << " " << persons[i] << endl;
    }
    cout << "A " << A << endl;
    cout << "B " << B << endl;
    cout << "C " << C << endl;
}