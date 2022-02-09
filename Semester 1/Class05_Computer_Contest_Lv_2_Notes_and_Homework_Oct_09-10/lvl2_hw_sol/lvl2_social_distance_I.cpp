#include <bits/stdc++.h>
using namespace std;
int n, ans, mi=1e9; string s; vector<int> gap;
int main(){
    //freopen("test.txt", "r", stdin);
    cin >> n >> s;
    int fst = s.find('1'), lst = s.rfind('1');
    if(fst == -1) { cout << n-1 << "\n"; return 0; }
    ans = max(fst/2, (n-1-lst)/2);
    gap.push_back(fst); gap.push_back(n-1-lst);
    for(int st=fst; st<lst; ){
        int nxt = s.find('1', st+1), mid = (st+nxt)/2;
        gap.push_back(mid - st);  mi = min(mi, nxt - st);
        ans = max(ans, (nxt-st)/3); st = nxt;
    }
    sort(gap.begin(), gap.end(), greater<int>());
    cout << min(max(ans, gap[1]), mi) << "\n";
}