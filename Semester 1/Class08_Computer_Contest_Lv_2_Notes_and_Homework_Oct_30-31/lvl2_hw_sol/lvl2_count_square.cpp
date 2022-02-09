#include <bits/stdc++.h>
using namespace std;
unordered_map<int, int> mp; // unordered map
int h, v, x[1500], y[1500]; long long ans;
int main(){
    cin.sync_with_stdio(0); cin.tie(0);
    cin >> h >> v;
    for(int i=0; i<h; i++) {
        cin >> y[i];
        for(int j=0; j<i; j++) {
            mp[y[i] - y[j]]++;
        }
    }
    for(int i=0; i<v; i++) {
        cin >> x[i];
        for(int j=0; j<i; j++) {
            if (mp.count(x[i] - x[j]))
                ans += mp[x[i]-x[j]];
        }
    }
    cout << ans << endl;
}