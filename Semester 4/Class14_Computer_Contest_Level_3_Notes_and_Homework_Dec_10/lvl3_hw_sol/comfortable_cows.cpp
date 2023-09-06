#include <bits/stdc++.h>
using namespace std;
int n = 0, ans = 0, a[1003][1003]; bool cow[1003][1003];
int main(){
    cin >> n;
    int dir[4][2] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    for(int i=1; i<=n; i++) {
        int r, c;  cin >> r >> c; r++; c++;
        cow[r][c] = true;
        if(a[r][c] == 3) ans++;
        for(int k=0; k<4; k++) {
            int nr = r + dir[k][0], nc = c + dir[k][1];
            a[nr][nc]++;
            if(cow[nr][nc] && a[nr][nc] == 3) ans++;
            if(cow[nr][nc] && a[nr][nc] == 4) ans--;
        }
        cout << ans << "\n";
    }
}