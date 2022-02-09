#include <bits/stdc++.h>
using namespace std;
int H, W, a[20][20];
int main(){
    cin >> H >> W;
    for(int i=0; i<H; i++)
        for(int j=0; j<W; j++)
            cin >> a[i][j];
    for(int j=W-1; j>=0; j--){
        for(int i=0; i<H; i++)
            cout << a[i][j] << " ";
        cout << "\n";
    }
}