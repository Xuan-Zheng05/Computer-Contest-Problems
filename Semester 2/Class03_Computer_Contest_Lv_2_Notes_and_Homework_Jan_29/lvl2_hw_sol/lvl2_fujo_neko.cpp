#include <bits/stdc++.h>
using namespace std;
int R, C, Q; bool row[1003], col[1003]; char g[1003];
int main(){
    scanf("%d %d", &R, &C);
    for(int i=1; i<=R; i++){
        scanf("%s", g+1);
        for(int j=1; j<=C; j++)
            if(g[j]=='X') row[i]=1, col[j]=1;
    }
    scanf("%d", &Q);
    for(int i=0, x, y; i<Q; i++){
        scanf("%d %d", &x, &y);
        if(row[y] || col[x]) printf("Y\n");
        else printf("N\n");
    }
}