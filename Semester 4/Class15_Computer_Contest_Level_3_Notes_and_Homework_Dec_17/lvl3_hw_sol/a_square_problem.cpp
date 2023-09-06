#include <bits/stdc++.h>
using namespace std;
const int MM=40;
int N, a[MM]; char g[MM][MM]; bool row[MM][MM], col[MM][MM], flag=true;
int getV(char c){
    if(c>='0' && c<='9') return c-'0';
    return 10 + c - 'A';
}
int main(){
    scanf("%d", &N);
    for(int i=0; i<N; i++){
        for(int j=0; j<N; j++){
            scanf(" %c", &g[i][j]);
            int v = getV(g[i][j]);
            if(row[i][v] || col[j][v]) flag=false;
            row[i][v] = col[j][v] = true;
        }
    }
    if(!flag) { printf("No\n"); return 0;}
    flag = true;
    for(int i=0; i<N; i++){
        a[i] = getV(g[0][i]);
        if(i!=0 && a[i] < a[i-1]) flag=false;
    }
    for(int i=0; i<N; i++){
        a[i] = getV(g[i][0]);
        if(i!=0 && a[i] < a[i-1]) flag=false;
    }
    printf("%s\n", flag? "Reduced":"Latin");
}