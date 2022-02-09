#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pi;
const int MM = 2002;
int N, a[MM][MM]; bool row[MM], col[MM];
void print(){
    if(a[1][1]){
        for(int i=1; i<=N; i++) col[i] ^= 1;
    }
    int tot = 0;
    for(int i=1; i<=N; i++) tot += row[i] + col[i];
    printf("%d\n", tot);
    for(int i=1; i<=N; i++) {
        if(row[i]) printf("R %d\n", i);
        if(col[i]) printf("C %d\n", i);
    }
}
int main(){
    scanf("%d", &N);
    for(int i=1; i<=N; i++)
        for(int j=1; j<=N; j++)
            scanf("%d", &a[i][j]);
    for(int i=1; i<=N; i++){
        if(a[1][i]) {
            col[i] = true;
            for(int j=1; j<=N; j++) a[j][i] ^= 1;
        }
    }
    for(int i=1; i<=N; i++){
        if(a[i][1]) {
            row[i] = true;
            for(int j=1; j<=N; j++) a[i][j] ^= 1;
        }
    }
    int cnt = 0;
    for(int i=2; i<=N; i++)
        for(int j=2; j<=N; j++)
            cnt += a[i][j];
    if(cnt == 0 || (cnt == (N-1)*(N-1) && a[1][1])) print();
    else printf("-1\n");

}