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
int n, odd, even, ans;
int main(){
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> n;
    for(int i=1, x; i<=n; i++){
        cin >> x;
        if(x & 1) odd++;
    }
    even = n - odd;
    if(odd < even) cout << 2*odd + 1 << endl;
    else if(odd == even) cout << n << endl;
    else{
        odd -= even;
        if(odd % 3 == 0) cout << 2*even + odd/3*2 << endl;
        else if(odd % 3 == 1) cout << 2*even + odd/3 * 2 -1 << endl;
        else cout << 2*even + odd/3 * 2 + 1 << endl;
    }
}