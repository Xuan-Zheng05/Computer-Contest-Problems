#include <bits/stdc++.h>
using namespace std;
#define f first
#define s second
typedef pair<int, int> pi;
int n, r=1e9; vector<pi> p;
int main(){
    scanf("%d", &n);
    for(int i=0, x, s; i<n; i++){
        scanf("%d %d", &x, &s);
        p.push_back({x, s});
    }
    sort(p.begin(), p.end());
    for(int i=1; i<n; i++){
        if(p[i].s != p[i-1].s) r = min(r, p[i].f - p[i-1].f);
    }
    int lst = -1, cnt = 0;
    for(int i=0; i<n; i++){
        if(p[i].s) {
            if(lst == -1 || p[i].f >= lst+r) {
                cnt ++; lst = p[i].f;
            }else lst = p[i].f;
        }
    }
    printf("%d\n", cnt);
}