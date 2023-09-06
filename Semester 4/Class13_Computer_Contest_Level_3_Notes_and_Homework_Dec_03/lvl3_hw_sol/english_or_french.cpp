#include <iostream>
#include <string>
using namespace std;

int main()
{
    int lines;
    cin >> lines;
    cin.ignore(1, '\n');

    int Scount = 0;
    int Tcount = 0;

    string sent[lines];

    for(int i = 0; i < lines; i++)
    {
        getline(cin, sent[i]);
        for(int q = 0; q < sent[i].length(); q++)
        {
            if(sent[i][q] == 's' || sent[i][q] == 'S')
            {
                Scount++;
            }
            if(sent[i][q] == 't' || sent[i][q] == 'T')
            {
                Tcount++;
            }
        }
    }

    if(Scount > Tcount)
    {
        cout << "French" << endl;
    }
    if(Scount < Tcount)
    {
        cout << "English" << endl;
    }
    if(Scount == Tcount)
    {
        cout << "French" << endl;
    }
}
