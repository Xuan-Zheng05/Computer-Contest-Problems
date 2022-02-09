#include <bits/stdc++.h>
using namespace std;
int M, N, K, ans; char op;
int main(){
    cin.sync_with_stdio(0); cin.tie(0);
    cin >> M >> N >> K;
    int row[M+1] = {}, col[N+1] = {};
    for(int i=1, idx; i<=K; i++) {
        cin >> op >> idx;
        if(op == 'R') row[idx]++;
        else col[idx]++;
    }
    for(int i=1; i<=M; i++) {
        for(int j=1; j<=N; j++){
            if((row[i] + col[j])%2) {
                ans++;
            }
        }
    }
    cout << ans << endl;
}