#include <bits/stdc++.h>
using namespace std;
const int MM = 1e5+5;
int N, M, p[MM], ans;
bool check(int lmt){
    int last=p[1], cnt = 1;
    for(int i=2; i<=N; i++){
        if(p[i] - last >= lmt){
            last = p[i]; cnt++;
        }
    }
    return cnt >= M;
}
int main(){
    cin >> N >> M;
    for(int i=1; i<=N; i++) cin >> p[i];
    sort(p+1, p+N+1);
    int lo = 1, hi = p[N] - p[1];
    while(lo <= hi){
        int mid = (lo + hi)/2;
        if( check(mid) ) { ans = mid; lo = mid + 1;}
        else hi = mid - 1;
    }
    cout << ans << endl;
}