#include <bits/stdc++.h>
using namespace std;
int N, h[1002], s[1002], ans = INT_MAX;
int main(){
    scanf("%d", &N);
    for(int i=1; i<=N; i++){
        scanf("%d %d", &h[i], &s[i]);
        for(int j=1; j<i; j++){
            if((h[i] - h[j])*(s[i]-s[j]) > 0) continue;
            int dh = h[j] - h[i], ds = s[i] - s[j];
            if(dh == 0) ans = 0;
            else if(ds!=0 && dh % ds == 0) ans = min(ans, dh/ds);
        }
    }
    if(ans == INT_MAX) printf("-1\n");
    else printf("%d\n", ans);
}