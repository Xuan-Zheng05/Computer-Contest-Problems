#include <iostream>
#include <cstdio>
using namespace std;

int eval(char ch)
{
    if(ch == 'I') return 1;
    else if(ch == 'V') return 5;
    else if(ch == 'X') return 10;
    else if(ch == 'L') return 50;
    else if(ch == 'C') return 100;
    else if(ch == 'D') return 500;
    else if(ch == 'M') return 1000;
}

int main()
{
    //freopen("2012_s2.txt", "r", stdin);
    string aromatic;
    cin >> aromatic;

    int old_r = 0, old_val = 0, sum = 0;
    for(int i=0; i<aromatic.size(); ){
        int a = aromatic[i++] - '0';
        int r = eval(aromatic[i++]);
        sum += a*r;
        if(old_r < r)
            sum -= 2*old_val;
        old_r = r;  old_val = a*r;
    }
    cout << sum << endl;
    return 0;
}