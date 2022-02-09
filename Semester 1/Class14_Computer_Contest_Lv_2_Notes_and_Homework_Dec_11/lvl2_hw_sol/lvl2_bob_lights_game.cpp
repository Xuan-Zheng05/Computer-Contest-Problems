#include <bits/stdc++.h>
using namespace std;
const int MM = 1e5+5;
int N, M, dif[MM], ans;
int main(){
    //freopen("test.txt", "r", stdin);
    scanf("%d %d", &N, &M);
    for(int i=1, x, y; i<=M; i++){
        scanf("%d %d", &x, &y);
        dif[x]++; dif[y+1]--;
    }
    for(int i=1; i<=N; i++){
        dif[i] += dif[i-1];
        if(dif[i] & 1) ans++;
    }
    printf("%d\n", ans);
}