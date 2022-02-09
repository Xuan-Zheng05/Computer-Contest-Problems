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
const int mod = 1e9 + 7, MM = 5003;
int N, K, Q, t[MM], l[MM], b[MM], rr[MM];
int main(){
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> N >> K >> Q;
    for(int i=1; i<=K; i++) cin >> t[i] >> l[i] >> b[i] >> rr[i];
    for(int i=1, r, c; i<=Q; i++) {
        cin >> r >> c;
        for(int j=K; j>=1; j--){
            if(t[j] <= r && r <= b[j] && l[j] <= c && c <= rr[j]){
                int c2 = r + l[j] - t[j], r2 = l[j] + b[j] - c;
                swap(r2, r); swap(c2, c);
            }
        }
        cout << 1LL*(r-1)*N + c << "\n";
    }
}