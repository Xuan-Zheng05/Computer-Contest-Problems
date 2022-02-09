#include <bits/stdc++.h>
using namespace std;
int N, a[100002], b[100002], ans;
int main(){
    scanf("%d", &N);
    for(int i=1; i<=N; i++){
        scanf("%d", &a[i]); a[i] += a[i-1];
    }
    for(int i=1; i<=N; i++){
        scanf("%d", &b[i]); b[i] += b[i-1];
        if(a[i]==b[i]) ans = i;
    }
    printf("%d\n", ans);
}