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
const int mod = 1e9 + 7;
int n, d[4][2]={{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; string s; char c[128];
int main(){
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    c['N'] = 0; c['E'] = 1; c['S']=2; c['W']=3;
    for(cin >> n; n--; ){
        cin >> s; int x = 0, y = 0; vii p;
        p.pb({0, 0});
        for(int i=0; i<s.size(); i++){
            x += d[c[s[i]]][0]; y += d[c[s[i]]][1];
            p.pb({x, y});
        }
        int area = 0, m = p.size();
        for(int i=0; i<m; i++)
            area += p[i].f*p[(i+1)%m].s - p[i].s * p[(i+1)%m].f;
        if(area < 0) cout << "CW\n";
        else cout << "CCW\n";
    }
}