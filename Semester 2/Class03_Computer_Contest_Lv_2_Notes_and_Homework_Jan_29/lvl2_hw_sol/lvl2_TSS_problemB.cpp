#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int N, Q;
int main(){
    cin.sync_with_stdio(0); cin.tie(0);
    cin >> N >> Q;  vector<ll> d(N);
    for(int i=0, x, y; i<N; i++){
        cin >> x >> y;
        d[i] = 1LL*x*x + 1LL*y*y;
    }
    sort(d.begin(), d.end());
    for(int i=1, r; i<=Q; i++){
        cin >> r;
        cout << upper_bound(d.begin(), d.end(), 1LL*r*r) - d.begin() << endl;
    }
}