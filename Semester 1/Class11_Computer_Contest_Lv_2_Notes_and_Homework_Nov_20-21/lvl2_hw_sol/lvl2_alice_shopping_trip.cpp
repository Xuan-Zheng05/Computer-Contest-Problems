#include <bits/stdc++.h>
using namespace std;
int T, N, t, cnt; vector<int> v;
bool cmp(int x, int y){ return abs(x) < abs(y); }
int main(){
    scanf("%d %d", &T, &N);
    for(int i=0, x; i<N; i++) {
        scanf("%d", &x); v.push_back(x);
    }
    v.push_back(0);
    sort(v.begin(), v.end(), cmp);
    for(int i=1; i<v.size(); i++){
        t += abs(v[i] - v[i-1]);
        if(t > T) break;
        cnt++;
    }
    printf("%d\n", cnt);
}