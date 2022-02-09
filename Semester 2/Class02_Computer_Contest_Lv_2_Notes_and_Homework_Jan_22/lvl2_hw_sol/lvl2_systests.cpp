#include <bits/stdc++.h>
using namespace std;
const int MM = 1e5+2;
int B, F, a[MM], b[MM], val[MM], c[MM], ans;
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> B;
    for(int i=0; i<B; i++) cin >> a[i] >> b[i] >> val[i];
    cin >> F;
    for(int i=0; i<F; i++) cin >> c[i];
    sort(c, c+F);
    for(int i=0; i<B; i++) {
        int pos = lower_bound(c, c+F, a[i]) - c;
        if(pos == F || c[pos] > b[i]) ans += val[i];
    }
    cout << ans << endl;
}