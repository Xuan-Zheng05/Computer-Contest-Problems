#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pi;
int N, Q; pi pre[500002], suf[500002], ans;
pi getmax(pi a, pi b){
    int mx = max(a.first, b.first), cnt = 0;
    if(mx == a.first) cnt += a.second;
    if(mx == b.first) cnt += b.second;
    return {mx, cnt};
}
int main(){
    cin.sync_with_stdio(0); cin.tie(0);
    cin >> N >> Q;
    for(int i=1; i<=N; i++){
        cin >> pre[i].first;  pre[i].second = 1;
        suf[i] = pre[i];
    }
    for(int i=1; i<=N; i++)
        pre[i] = getmax(pre[i-1], pre[i]);
    for(int i=N; i>=1; i--)
        suf[i] = getmax(suf[i+1], suf[i]);
    for(int i=1, l, r; i<=Q; i++){
        cin >> l >> r;  ans = { 0, 0 };
        if(l > 1) ans = getmax(ans, pre[l-1]);
        if(r < N) ans = getmax(ans, suf[r+1]);
        cout << ans.first << " " << ans.second << "\n";
    }
}