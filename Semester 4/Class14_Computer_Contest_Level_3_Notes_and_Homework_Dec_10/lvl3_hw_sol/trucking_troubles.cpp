#include <bits/stdc++.h>
using namespace std;
const int MM = 1e4+5;
struct edge { int u, v, w;};
int n, m, d, p[MM], ans; vector<edge> a; vector<int> dest;
bool cmp(edge x, edge y){ return x.w > y.w; }
int fd(int d){ return d==p[d]? d : p[d] = fd(p[d]); }
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m >> d;
    for(int i=1; i<=n; i++) p[i] = i;
    for(int i=1, u, v, w; i<=m; i++){
        cin >> u >> v >> w; a.push_back(edge{u, v, w});
    }
    sort(a.begin(), a.end(), cmp);
    for(int i=1, x; i<=d; i++){
        cin >> x; dest.push_back(x);
    }
    for(int i=0, j=0; i<dest.size(); i++){
        for( ;fd(dest[i]) != fd(1); j++) {
            int fu = fd(a[j].u), fv = fd(a[j].v);
            if(fu != fv) { p[fu] = fv; ans = a[j].w; }
        }
    }
    cout << ans << endl;
}