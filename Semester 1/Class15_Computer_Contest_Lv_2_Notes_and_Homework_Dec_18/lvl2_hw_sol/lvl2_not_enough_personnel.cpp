#include <bits/stdc++.h>
using namespace std;
int N, Q;
int main(){
    cin >> N;
    vector<string> name(N); vector<int> s(N);
    for(int i=0; i<N; i++) {
        cin >> name[i] >> s[i];
    }
    cin >> Q;
    for(int i=1, x, d; i<=Q; i++) {
        cin >> x >> d;
        int mi = INT_MAX; string ans = "";
        for(int j=0; j<N; j++) {
            if(s[j] >= x && s[j] <= x + d) {
                if(s[j] - x < mi) {
                    mi = s[j] - x; ans = name[j];
                }
            }
        }
        if(mi == INT_MAX) cout << "No suitable teacher!\n";
        else cout << ans << "\n";
    }
}