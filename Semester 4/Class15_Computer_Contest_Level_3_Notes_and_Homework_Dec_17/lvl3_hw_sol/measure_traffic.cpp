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
struct E { int op, l, h;};
int N, mi, mx; vector<E> vec; string s;
void f(int v){
    reverse(all(vec));
    mi = -inf; mx = inf;
    for(auto &[op, l, h] : vec){
        if(op == 0) {
            mi = max(mi, l); mx = min(mx, h);
        }else if(op == v) {
            mi = max(0, mi-h); mx = max(0, mx-l);
        }else {
            mi += l; mx += h;
        }
    }
    cout << mi << " " << mx << endl;
}
int main(){
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> N;
    for(int i=0, op, x, y; i<N; i++){
        cin >> s >> x >> y;  op=0;
        if(s == "on") op=1;
        if(s == "off") op=-1;
        vec.pb({op, x, y});
    }
    f(1); f(-1);
}