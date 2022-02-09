#include <bits/stdc++.h>
using namespace std;
int N, a[100001];
bool cmp(int x, int y){
    int tx = x%10, ty = y%10;
    return tx < ty || (tx == ty && x > y);
}
int main(){
    scanf("%d", &N);
    for(int i=0; i<N; i++) scanf("%d", &a[i]);
    sort(a, a+N, cmp);
    for(int i=0; i<N; i++) printf("%d ", a[i]);
}