#include <bits/stdc++.h>
using namespace std;
int N, a[100001], half; double med1, med2, med;
void printMed(int sz, int offset) {
    if(sz & 1) printf("%d ", a[offset + (sz+1)/2]);
    else printf("%.1f ", (a[offset + sz/2] + a[offset + sz/2 + 1])/2.0);
}
int main(){
    scanf("%d", &N);
    for(int i=1; i<=N; i++){
        scanf("%d", &a[i]);
    }
    sort(a+1, a+N+1);  half = N/2;
    printf("%d %d ", a[1], a[N]);
    printMed(half, 0); printMed(N, 0); printMed(half, (N+1)/2);
}