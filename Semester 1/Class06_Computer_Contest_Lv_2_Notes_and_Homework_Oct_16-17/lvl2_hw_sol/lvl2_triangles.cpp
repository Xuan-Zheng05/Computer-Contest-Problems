#include <bits/stdc++.h>
using namespace std;
#define f first
#define s second
typedef pair<int, int> pi;
int N, ans; vector<pi> p;
int main(){
    scanf("%d", &N);
    for(int i=0, x, y; i<N; i++){
        scanf("%d %d", &x, &y);
        p.push_back({x, y});
    }
    for(int i=0; i<N; i++)
        for(int j=0; j<N; j++)
            for(int k=0; k<N; k++)
                if(p[i].f == p[j].f && p[i].s == p[k].s)
                    ans = max(ans, abs(p[i].s - p[j].s)*abs(p[i].f - p[k].f));
    printf("%d\n", ans);
}