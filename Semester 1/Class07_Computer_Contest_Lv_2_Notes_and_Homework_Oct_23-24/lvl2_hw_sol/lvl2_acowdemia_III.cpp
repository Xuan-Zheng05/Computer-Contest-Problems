#include <bits/stdc++.h>
using namespace std;
#define f first
#define s second
#define lc (rt<<1)
#define rc (rt<<1|1)
#define pb push_back
#define cl(a, b) memset(a, b, sizeof(a))
#define mp(a, b) make_pair((a), (b))
#define all(x) x.begin(),x.end()
typedef long long ll;
typedef pair<int, int> pi;
typedef pair<ll, ll> pl;
typedef pair<pi, int> pii;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<pi> vii;
typedef vector<pl> vll;
typedef vector<pii> viii;
const int inf = 0x3F3F3F3F;
const ll infl = 0x3F3F3F3F3F3F3F3FLL;
const int mod = 1e9 + 7, MM = 1003;
int N, M, d[4][2]={{-1,0},{1,0},{0,-1},{0,1}}; char g[MM][MM]; unordered_set<ll> vis;
ll hsh(pi a, pi b){
    int va = a.f*M + a.s, vb = b.f*M + b.s;
    if(va > vb) swap(va, vb);
    return 1LL*va*N*M + vb;
}
int main(){
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> N >> M;
    for(int i=0; i<N; i++)
        for(int j=0; j<M; j++)
            cin >> g[i][j];
    for(int i=0; i<N; i++){
        for(int j=0; j<M; j++){
            if(g[i][j] != 'G') continue;
            vii tmp;
            for(int k=0; k<4; k++) {
                int ni = i + d[k][0], nj = j + d[k][1];
                if(ni < 0 || ni >= N || nj < 0 || nj >= M || g[ni][nj] != 'C') continue;
                tmp.pb({ni, nj});
            }
            if(tmp.size() == 2) vis.insert(hsh(tmp[0], tmp[1]));
            else if(tmp.size() > 2){
                pi a, b;
                for(int p=0; p<tmp.size(); p++)
                    for(int q=p+1; q<tmp.size(); q++)
                        if(tmp[p].f == tmp[q].f || tmp[p].s == tmp[q].s) { a = tmp[p]; b = tmp[q]; break;}
                vis.insert(hsh(a, b));
            }
        }
    }
    cout << vis.size() << endl;
}