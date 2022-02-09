#include <iostream>
#include <cstdio>
#include <algorithm>
using namespace std;
struct E{ int x, y, id; } a[50000];
int N, K, mx, id;
bool cmp(E p, E q){ return p.x > q.x; }
int main(){
    scanf("%d %d", &N, &K);
    for(int i=0; i<N; i++) {
        scanf("%d %d", &a[i].x, &a[i].y);
        a[i].id = i;
    }
    sort(a, a+N, cmp);
    for(int i=0; i<K; i++){
        if(a[i].y > mx){ mx = a[i].y; id = a[i].id;}
    }
    printf("%d\n", id+1);
}