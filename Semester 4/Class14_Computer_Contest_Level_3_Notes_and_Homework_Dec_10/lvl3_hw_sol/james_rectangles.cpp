#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
typedef pair<pair<int, int>, ll> pil;
int N, x[1000], y[1000]; map<pil, int> mp; ll ans;
int main(){
    cin>>N;
    for(int i=0; i<N; i++) cin >> x[i] >> y[i];
    for(int i=0; i<N; i++) {
        for(int j=i+1; j<N; j++) {
            int mx = x[i] + x[j], my = y[i] + y[j];
            ll dis = (ll)(x[i] - x[j]) * (x[i] - x[j]) + (ll)(y[i] - y[j]) * (y[i] - y[j]);
            ans += mp[{{mx, my}, dis}];
            mp[{{mx, my}, dis}]++;
        }
    }
    cout << ans << endl;
}