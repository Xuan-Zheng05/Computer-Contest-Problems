#include <bits/stdc++.h>
using namespace std;
int n, q;
int main(){
    cin >> n >> q;  vector<int> a(n);
    for(int i=0; i<n; i++) {
        cin >> a[i];
    }
    sort(a.begin(), a.end());
    for(int i=0, x, y; i<q; i++) {
        cin >> x >> y;
        cout << upper_bound(a.begin(), a.end(), y) - lower_bound(a.begin(), a.end(), x) << "\n";
    }
}