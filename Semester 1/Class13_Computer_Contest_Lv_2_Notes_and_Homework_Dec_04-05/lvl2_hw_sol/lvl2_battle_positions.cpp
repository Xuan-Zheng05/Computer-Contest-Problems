#include <bits/stdc++.h>
using namespace std;
int I, N, J, ans, dif[100002];
int main(){
    scanf("%d %d %d", &I, &N, &J);
    for(int i=0, x, y, v; i<J; i++){
        scanf("%d %d %d", &x, &y, &v);
        dif[x] += v;  dif[y+1] -= v;
    }
    for(int i=1; i<=I; i++){
        dif[i] += dif[i-1];
        if(dif[i] < N) ans++;
    }
    printf("%d\n", ans);
}