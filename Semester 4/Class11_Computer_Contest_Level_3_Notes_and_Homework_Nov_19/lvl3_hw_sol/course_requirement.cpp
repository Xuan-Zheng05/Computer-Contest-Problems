#include <bits/stdc++.h>
using namespace std;
const int MM = 2e5+5;
int n, in[MM]; vector<int> adj[MM], ans; queue<int> q;
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n;
    for(int i=1, m; i<=n; i++) {
        cin >> m;
        for(int j=1, x; j<=m; j++) {
            cin>>x; adj[x].push_back(i); in[i]++;
        }
    }
    for(int i=1; i<=n; i++){
        if(!in[i]) q.push(i);
    }
    while(!q.empty()) {
        int u = q.front(); q.pop();
        ans.push_back(u);
        for(int v : adj[u]){
            if(--in[v] == 0) q.push(v);
        }
    }
    for(int i=0; i<n; i++)
        cout << ans[i] << " \n"[i==n-1];
}