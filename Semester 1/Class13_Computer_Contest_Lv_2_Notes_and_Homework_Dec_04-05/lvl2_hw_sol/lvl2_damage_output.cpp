#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int N, ans=1e9; ll M, psa[500005]; deque<int> Q;
int main(){
    scanf("%d %lld", &N, &M);
    Q.push_back(0);
    for(int i=1; i<=N; i++){
        scanf("%lld", &psa[i]); psa[i]+=psa[i-1];
        while(!Q.empty() && psa[i] - psa[Q.front()] >= M){
            ans = min(ans, i-Q.front());  Q.pop_front();
        }
        Q.push_back(i);
    }
    printf("%d\n", ans>N? -1: ans);
}