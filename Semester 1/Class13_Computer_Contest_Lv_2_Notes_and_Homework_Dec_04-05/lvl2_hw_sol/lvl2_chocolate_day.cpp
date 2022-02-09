#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const int MM = 1e6+3;
int N, T, ans; ll L, dif[MM], psa[MM];
int main(){
    scanf("%d %d", &N, &T);
    for(int i=1, x, y, z; i<=T; i++){
        scanf("%d %d %d", &x, &y, &z);
        dif[x] += z; dif[y+1] -= z;
    }
    scanf("%lld", &L);
    for(int i=1, j=0; i<=N; i++) {
        dif[i] += dif[i-1];
        psa[i] = psa[i-1] + dif[i];
        while(psa[i] - psa[j] > L) j++;
        ans = max(ans, i-j);
    }
    printf("%d\n", ans);
}