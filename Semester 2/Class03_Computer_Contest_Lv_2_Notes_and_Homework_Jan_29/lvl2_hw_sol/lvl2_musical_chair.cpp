#include <bits/stdc++.h>
using namespace std;
const int MM = 1000002;
typedef pair<int, int> pi;
int N, K, b[MM], cnt; bool a[MM]; stack<pi> st;
int main(){
    scanf("%d %d", &N, &K);
    for(int i=1, x; i<=K; i++){ scanf("%d", &x); a[x]=1; }
    for(int i=1, x; i<=K+1; i++){
        scanf("%d", &x);
        if(a[x]) a[x] = 0;
        else b[x] = i;
    }
    for(int i=1; i<=N+N; i++){
        int j = (i > N ? i-N : i);
        if(b[j]) { st.push({j, b[j]}); b[j] = 0;}
        if(a[j] && !st.empty()) {
            st.pop(); a[j] = 0;
        }
    }
    printf("%d\n", st.top().second);
}