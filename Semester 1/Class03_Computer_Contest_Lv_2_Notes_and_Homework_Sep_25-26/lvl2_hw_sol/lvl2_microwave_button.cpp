//#include <bits/stdc++.h>
using namespace std;
int hh, mm, ss, desire, minDif=INT_MAX, bestH, bestM, bestS; char str[11]; bool work[11];
int main(){
    scanf("%d:%d:%d %s", &hh, &mm, &ss, str);
    desire = hh*3600 + mm*60 + ss;
    for(int i=0; str[i]; i++){
        work[str[i]-'0']=true;
    }
    for(int h=0; h<=99; h++) {
        if(!work[h/10] || !work[h%10]) continue;
        for(int m=0; m<=99; m++) {
            if(!work[m/10] || !work[m%10]) continue;
            for(int s=0; s<=99; s++) {
                if(!work[s/10] || !work[s%10]) continue;
                int time = h*3600 + m*60 + s;
                if(abs(desire - time) < minDif) {
                    minDif = abs(desire - time);
                    bestH = h; bestM = m; bestS = s;
                }
            }
        }
    }
    printf("%02d:%02d:%02d\n", bestH, bestM, bestS);
}