#include <bits/stdc++.h>
using namespace std;
int N, K, cnt; bool row[102], col[102], d1[205], d2[205];
int main(){
    scanf("%d %d", &N, &K);
    for(int i=1, r, c; i<=K; i++){
        scanf("%d %d", &r, &c); r--; c--;
        row[r] = 1; col[c] = 1; d1[r+c]=1; d2[r+N-1-c]=1;
    }
    for(int r=0; r<N; r++)
        for(int c=0; c<N; c++)
            if(!row[r] && !col[c] && !d1[r+c] && !d2[r+N-1-c])
                cnt++;
    printf("%d\n", cnt);
}