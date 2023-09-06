#include <bits/stdc++.h>
using namespace std;
const int MM = 1e5+5, mod = 1e9+7;
typedef long long ll;
typedef pair<int, int> pi;
int N, M, Q, pre[MM], far; vector<pi> adj[MM]; ll dis[MM], D, ans; bool vis[MM]; vector<ll> r;
void dfs(int u, int pa, ll d){
    dis[u] = d; pre[u] = pa; vis[u] = 1;
    if(d > D) { D = d; far = u; }
    for(auto e : adj[u]){
        int v = e.first, w = e.second;
        if(v != pa) dfs(v, u, d + w);
    }
}
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> N >> M >> Q;
    for(int i=1, u, v, w; i<=M; i++) {
        cin >> u >> v >> w;  adj[u].push_back({v, w}); adj[v].push_back({u, w});
    }
    for(int i=1; i<=N; i++) {
        if(vis[i]) continue;
        D = -1; dfs(i, 0, 0); D = -1; dfs(far, 0, 0);
        if(Q == 1) { ans += D + 1; continue;}
        ll rad = 1e18;
        for(int i=far; i; i = pre[i]) rad = min(rad, max(dis[i], D-dis[i]));
        r.push_back(rad);
    }
    if(Q == 1) cout << ans - 1 << "\n";
    else {
        sort(r.rbegin(), r.rend());
        if(r.size() > 1 && r[0] == r[1]) cout << r[0] + 1 << "\n";
        else cout << r[0] << "\n";
    }
}