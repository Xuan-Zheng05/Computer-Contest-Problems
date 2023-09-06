#include <bits/stdc++.h>
using namespace std;
const int MM = 3e5+5;
typedef long long ll;
int N, M, val[MM]; vector<int> adj[MM];
void dfs(int u, int mx){
    val[u] = mx;
    for(int v : adj[u])
        if(!val[v]) dfs(v, mx);
}
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> N >> M;
    for(int i=1, u, v; i<=M; i++) {
        cin >> u >> v;  adj[v].push_back(u);
    }
    for(int i=N; i>=1; i--) {
        if(!val[i]) dfs(i, i);
    }
    for(int i=N; i>=1; i--) {
        if(val[i] > i) {
            cout << i << " " << val[i] << "\n";
            return 0;
        }
    }
    cout << "-1\n";
}