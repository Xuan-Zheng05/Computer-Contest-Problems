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
const int mod = 1e9 + 7, MM = 1e5+2;
int N, L, c[MM];
bool check(int x){
    int cnt = 0;
    for(int i=1; i<=x; i++){
        if(c[i] >= x) continue;
        if(c[i]+1 == x) cnt++;
        else return false;
    }
    return cnt <= L;
}
int main(){
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> N >> L;
    for(int i=1; i<=N; i++) cin >> c[i];
    sort(c+1, c+N+1, greater<int>());
    int lo = 0, hi = 1e5, ans = 0;
    while(lo <= hi) {
        int mid = lo + hi >> 1;
        if(check(mid)) { ans = mid; lo = mid + 1;}
        else hi = mid - 1;
    }
    cout << ans << endl;
}