#include <bits/stdc++.h>
using namespace std;
int N, K, Q, psa[100002]; vector<int> pos[2001];
int main(){
    scanf("%d %d %d", &N, &K, &Q);
    for(int i=1; i<=N; i++){
        scanf("%d", &psa[i]);
        if(psa[i]>=-1000 && psa[i]<=1000) 
            pos[psa[i]+1000].push_back(i);
        psa[i] += psa[i-1];
    }
    for(int i=1, a, b, x, y; i<=Q; i++){
        scanf("%d %d %d %d", &a, &b, &x, &y);
        if(psa[y] - psa[x-1] > K) {
            a+=1000; b+=1000;
            int pa = lower_bound(pos[a].begin(), pos[a].end(), x)
                    -pos[a].begin();
            int pb = lower_bound(pos[b].begin(), pos[b].end(), x)
                        -pos[b].begin();
            if(pa!=pos[a].size()&&pb!=pos[b].size()&&pos[a][pa]<=y&& pos[b][pb]<= y) 
                printf("Yes\n");
            else printf("No\n");
        }else printf("No\n");
    }
}