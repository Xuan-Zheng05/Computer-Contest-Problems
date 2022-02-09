#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<int, int> pi;
typedef pair<pi, ll> pil;
const int MM = 1005, MV = 2e6+10;
int N, x[MM], y[MM]; map<pil, int> cnt; ll ans;
int main(){
    scanf("%d", &N);
    for(int i=0; i<N; i++) scanf("%d %d", &x[i], &y[i]);
    for(int i=0; i<N; i++){
        for(int j=i+1; j<N; j++){
            int sx = x[i] + x[j], sy = y[i] + y[j]; ll dis = 1LL*(x[i]-x[j])*(x[i]-x[j])+1LL*(y[i]-y[j])*(y[i]-y[j]);
            ans += cnt[{{sx, sy}, dis}];
            cnt[{{sx, sy}, dis}]++;
        }
    }
    printf("%lld\n", ans);
}