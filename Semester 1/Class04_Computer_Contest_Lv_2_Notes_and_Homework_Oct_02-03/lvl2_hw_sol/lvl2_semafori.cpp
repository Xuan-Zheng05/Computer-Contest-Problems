#include <bits/stdc++.h>
using namespace std;
int N, L, t, ans, d[101];
int main(){
    scanf("%d %d", &N, &L);
    for(int i=1, r, g; i<=N; i++){
        scanf("%d %d %d", &d[i], &r, &g);
        t += d[i] - d[i-1];
        int rem = t % (r + g);
        if(rem < r) t += r - rem;
    }
    t += L - d[N];
    printf("%d\n", t);
}