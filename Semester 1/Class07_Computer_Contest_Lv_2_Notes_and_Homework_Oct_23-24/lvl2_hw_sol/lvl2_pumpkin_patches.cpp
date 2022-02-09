#include <bits/stdc++.h>
using namespace std;
int N, minx= 1e8, maxx=-minx, miny=1e8, maxy=-miny;
int main(){
    scanf("%d", &N);
    for(int i=0, x, y; i<N; i++){
        scanf("%d %d", &x, &y);
        minx = min(minx, x); maxx = max(maxx, x);
        miny = min(miny, y); maxy = max(maxy, y);
    }
    printf("%d\n", 2*(maxx-minx + maxy-miny));
}