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
int N, H, P; ll sum, ans=infl;
int main(){
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> N >> H >> P;  vl a(N);
    for(int i=0; i<N; i++) {
        cin >> a[i]; sum += a[i];
    }
    sort(all(a));
    ans = sum*P;
    for(int i=0; i<N; i++) {
        sum -= a[i];
        ans = min(ans, 1LL*H*a[i] + 1LL*(sum - 1LL*(N-i-1)*a[i])*P);
    }
    cout << ans << endl;
}