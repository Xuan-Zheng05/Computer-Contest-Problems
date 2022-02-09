#include <bits/stdc++.h>
using namespace std;
long long N, K, ans, tmp, cnt=1;
int main(){
    scanf("%lld %lld", &N, &K);
    tmp = min(N, K);
    for(; tmp>0; tmp/=2){
        ans++; cnt*=2;
    }
    ans = ans + (N-cnt+K-1)/K;
    printf("%lld\n", ans);
}