#include <bits/stdc++.h>
using namespace std;
const int MM = 2000;
int M, in[MM], idx; string a, b; vector<string> name; map<string, int> mp; vector<int> adj[MM];
int main(){
    cin >> M;
    for(int i=1; i<=M; i++){
        cin >> a >> b;
        if(!mp.count(a)){
            mp[a] = idx++; name.push_back(a);
        }
        if(!mp.count(b)){
            mp[b] = idx++; name.push_back(b);
        }
        adj[mp[b]].push_back(mp[a]); in[mp[a]]++;
    }
    priority_queue<int, vector<int>, greater<int> > q;
    for(int i=0; i<idx; i++){
        if(in[i] == 0) q.push(i);
    }
    vector<int> order;
    while(!q.empty()){
        int u = q.top(); q.pop();
        order.push_back(u);
        for(int v : adj[u])
            if(--in[v] == 0) q.push(v);
    }
    for(int x : order) cout << name[x] << "\n";
}