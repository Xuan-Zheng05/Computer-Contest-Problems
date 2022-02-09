#include <iostream>
using namespace std;

int main()
{
    int dice, square=1, lad_snk[6] = {54, 90, 99, 9, 40, 67};
    int next[6] = {19, 48, 77, 34, 64, 86};

    while(cin >> dice && dice)
    {
        if(square + dice <= 100)
            square = square + dice;
        for(int i=0; i<6; i++)
            if(lad_snk[i] == square)
                square = next[i];
        cout << "You are now on square " << square << endl;
        if(square == 100)
        {
            cout << "You Win!" << endl;
            return 0;
        }
    }

    cout << "You Quit!" << endl;
    return 0;
}