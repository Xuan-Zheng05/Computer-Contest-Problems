#include <bits/stdc++.h>
using namespace std;
const int MM = 1000005;
int N; bool vis[MM], mark[MM]; deque<int> pol, rob;
int main(){
    scanf("%d", &N);
    for(int i=1, x; i<=N; i++){
        scanf("%d", &x);
        if(!vis[x]){
            vis[x] = 1; pol.push_back(x); mark[i] = 1;
        }
    }
    for(int i=1; i<=N; i++)
        if(!vis[i]) rob.push_back(i);
    if(pol.size() == 1) {printf("-1\n"); return 0;}
    int t = pol.front(); pol.pop_front(); pol.push_back(t);
    for(int i=1; i<=N; i++){
        if(mark[i]) { printf("%d ", pol.front()); pol.pop_front(); }
        else { printf("%d ", rob.front()); rob.pop_front();}
    }
}