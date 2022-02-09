#include <bits/stdc++.h>
using namespace std;
int delay, year, month, day, hour, minute, second; char ch;
int cnt[13]={0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
int main(){
    scanf("%d %d/%d/%d %d:%d:%d", &delay, &year, &month, &day, &hour, &minute, &second);
    hour -= delay;
    while(hour < 0){
        hour += 24;
        day --;
        if(day == 0){
            month --;
            if(month == 0){
                year --;
                month = 12;
            }
            day = cnt[month];
        }
    }
    printf("%d/%02d/%02d %02d:%02d:%02d\n", year, month, day, hour, minute, second);
}