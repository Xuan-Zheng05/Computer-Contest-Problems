#include <bits/stdc++.h>
using namespace std;
int a[5], d[5][5];
int main(){
    for(int i=0; i<4; i++)
        cin >> a[i];
    for(int i=0; i<5; i++){
        d[i][i] = 0;
        for(int j=i-1; j>=0; j--)
            d[i][j] = d[i][j+1] + a[j];
        for(int j=i; j<4; j++)
            d[i][j+1] = d[i][j] + a[j];
        for(int j=0; j<=4; j++)
            cout << d[i][j] << " ";
        cout << endl;
    }
}