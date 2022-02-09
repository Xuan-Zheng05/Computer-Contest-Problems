#include <bits/stdc++.h>
using namespace std;
int N, a[102];
int main(){
    for(int t=1; t<=5; t++){
        scanf("%d", &N); set<int> st;
        for(int i=1; i<=N; i++) st.insert(i);
        for(int i=1; i<=N; i++)
            scanf("%d", &a[i]);
        bool flag = true;
        for(int i=1; i<=N; i++){
            a[i] = st.size() - a[i];
            if(a[i] <= 0) { printf("IMPOSSIBLE\n"); flag=false; break; }
            auto it = st.begin();
            for(int k=1; k<=a[i]; k++) it++;
            it--; a[i] = *it; st.erase(it);
        }
        if(flag){
            for(int i=1; i<=N; i++) printf("%d ", a[i]);
            printf("\n");
        }
    }
}