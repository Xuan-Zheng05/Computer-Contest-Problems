#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int main(){
    int n; ll m;
    cin >> n >> m;
    ll psa[n+1]={};
    for(int i=1; i<=n; i++){
        cin >> psa[i];
        psa[i] += psa[i-1];
    }
    int ans = 0;
    for(int l=1, r=1; r<=n; r++){
        while(psa[r] - psa[l-1] >= m){
            l++;
        }
        ans = max(ans, r - l + 1);
    }
    cout << ans << endl;
}