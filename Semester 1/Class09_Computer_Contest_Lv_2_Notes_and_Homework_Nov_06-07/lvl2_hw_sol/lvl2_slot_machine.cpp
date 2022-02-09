#include <bits/stdc++.h>

using namespace std;

int main()
{
    int quarters, first, second, third, total=0, time1=0, time2=0, time3=0;
    cin >> quarters >> time1 >> time2 >> time3;
    while(quarters > 0){
        time1++; quarters-=1; total++;
        if (time1%35 == 0){
            quarters+=30;
        }
        if (quarters <= 0){
            break;
        }
        time2++; quarters-=1; total++;
        if (time2%100 == 0){
            quarters+=60;
        }
        if (quarters <= 0){
            break;
        }
        time3++; quarters-=1; total++;
        if (time3%10 == 0){
            quarters+=9;
        }
    }
    cout << "Martha plays " << total << " times before going broke.";
    return 0;
}