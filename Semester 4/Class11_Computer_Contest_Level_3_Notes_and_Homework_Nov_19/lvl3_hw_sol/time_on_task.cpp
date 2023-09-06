#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    int t, c, i, total=0, time[101];
    cin >> t >> c;
    for(i=0; i<c; i++)
        cin >> time[i];
    sort(time, time+c);
    for(i=0; i<c; i++)
        if(total+time[i]<=t)
            total += time[i];
        else{
            cout << i << endl;
            return 0;
        }
    cout << i+1 << endl;
    return 0;
}
