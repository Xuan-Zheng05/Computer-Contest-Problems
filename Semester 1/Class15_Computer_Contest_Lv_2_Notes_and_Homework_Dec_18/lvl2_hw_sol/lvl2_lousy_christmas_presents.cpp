#include <bits/stdc++.h>
using namespace std;
#define f first
#define s second
#define lc (rt<<1)
#define rc (rt<<1|1)
#define pb push_back
#define cl(a, b) memset(a, b, sizeof(a))
typedef long long ll;
typedef pair<int, int> pi;
typedef pair<int, pi> pii;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<pi> vii;
typedef vector<pii> viii;
const int inf = 0x3F3F3F3F;
const ll infl = 0x3F3F3F3F3F3F3F3FLL;
const int mod = 1e9 + 7, MM = 1e6+5;
int N, M; vi p[MM];
int main(){
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> N >> M;
    for(int i=1, x; i<=N; i++){
        cin >> x; p[x].pb(i);
    }
    int ans = 0;
    for(int i=1, l, r; i<=M; i++){
        cin >> l >> r;
        if(p[l].empty() || p[r].empty()) continue;
        ans = max(ans, p[r].back() - p[l].front() + 1);
    }
    cout << ans << "\n";
}