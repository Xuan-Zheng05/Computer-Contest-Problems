#include <bits/stdc++.h>
using namespace std;
int n, cnt[7]; vector<int> adj[7];
void dfs(int u){
    cnt[u] = 1;
    for(int v: adj[u]){
        dfs(v);
        cnt[u] *= cnt[v];
    }
    cnt[u]+=1;
}
int main(){
    cin >> n;
    for(int i=1, u; i<n; i++){
        cin >> u; adj[u].push_back(i);
    }
    dfs(n);
    cout << cnt[n] - 1 << endl;
}