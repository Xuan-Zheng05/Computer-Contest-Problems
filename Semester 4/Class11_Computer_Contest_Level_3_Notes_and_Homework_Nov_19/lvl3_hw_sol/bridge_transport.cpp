
#include <iostream>
#include <list>
#include <cstdio>
using namespace std;

int main()
{
    int w, n, tmp, sum=0, cnt=0;
    list<int> ls;
    cin >> w >> n;
    for(int i=1; i<=4 && sum<=w; i++){
        cin >> tmp;
        ls.push_back(tmp);
        sum += tmp;
        cnt++;
    }
    for(int i=5; i<=n && sum<=w; i++){
        tmp = ls.front();
        ls.pop_front();
        sum -= tmp;
        cin >> tmp;
        ls.push_back(tmp);
        sum += tmp;
        cnt++;
    }
    if(sum<=w) cout<<cnt << endl;
    else     cout << cnt-1 << endl;
}
