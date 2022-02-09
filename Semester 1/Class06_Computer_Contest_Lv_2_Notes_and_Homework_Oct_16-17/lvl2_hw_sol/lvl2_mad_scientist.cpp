#include <bits/stdc++.h>
using namespace std;
int n, ans; char a[1002], b[1002]; bool same[1002];
int main(){
    scanf("%d %s %s", &n, a+1, b+1);
    for(int i=1; i<=n; i++){
        if(a[i]!=b[i]){
            same[i] = 1;
            if(!same[i-1]) ans++;
        }
    }
    printf("%d\n", ans);
}