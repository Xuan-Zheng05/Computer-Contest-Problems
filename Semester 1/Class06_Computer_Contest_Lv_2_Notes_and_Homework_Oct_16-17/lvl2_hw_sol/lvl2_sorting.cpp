#include <bits/stdc++.h>
using namespace std;
int N, a[200002],M1=0, M2=1e9;
int main(){
    scanf("%d %d", &N, &a[1]);
    for(int i=2; i<=N; i++){
        scanf("%d", &a[i]);
        if(!a[i-1] && !a[i]) continue;
        else if(!a[i-1] && a[i]) M2 = min(M2, a[i]);
        else if(a[i-1] && !a[i]) M1 = max(M1, a[i-1]);
        else if(a[i-1] > a[i]){
            printf("NO\n"); return 0;
        }
    }
    printf("%s\n", M1 <= M2? "YES":"NO");
}