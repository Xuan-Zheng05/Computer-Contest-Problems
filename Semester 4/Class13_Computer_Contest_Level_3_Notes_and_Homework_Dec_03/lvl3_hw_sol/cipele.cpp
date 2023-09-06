#include <bits/stdc++.h>
using namespace std;
const int MM = 1e5+5;
int n, m, ans; vector<int> lft, rit;
bool check(int lmt){
    int cnt = 0;
    for(int i=0, j=0; i<lft.size() && j < rit.size(); ){
        if(abs(lft[i] - rit[j]) <= lmt) {
            i++; j++; cnt++;
        }else if(lft[i] < rit[j]) {
            i++;
        }else {
            j++;
        }
    }
    return cnt == min(n, m);
}
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> n >> m;
    for(int i=0, x; i<n; i++) {
        cin >> x; lft.push_back(x);
    }
    for(int i=0, x; i<m; i++) {
        cin >> x; rit.push_back(x);
    }
    sort(lft.begin(), lft.end());
    sort(rit.begin(), rit.end());
    int lo = 0, hi = 1e9;
    while(lo <= hi){
        int mid = (lo + hi)/2;
        if(check(mid)) { ans = mid; hi = mid - 1;}
        else lo = mid + 1;
    }
    cout << ans << "\n";
}