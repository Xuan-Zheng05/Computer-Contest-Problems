#include <bits/stdc++.h>
using namespace std;
const int MM = 1e5+2;
int T, A, B, K, f[MM]; vector<int> fact[MM];
int main(){
    for(int i=1; i<MM; i++){
        for(int j=i; j<MM; j+=i){
            f[j]++;
        }
        fact[f[i]].push_back(i);
    }
    for(cin >> T;  T > 0; T--) {
        cin >> K >> A >> B;
        cout << upper_bound(fact[K].begin(), fact[K].end(), B) - lower_bound(fact[K].begin(), fact[K].end(), A) << "\n";
    }
}