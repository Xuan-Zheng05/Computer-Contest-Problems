#include <bits/stdc++.h>
using namespace std;
int n, op, idx; double pct;
int main(){
    cin >> n; vector<double> s(n);
    for(int i=0; i<n; i++){
        cin >> s[i];
    }
    while(true) {
        cin >> op;
        if(op == 77) break;
        if(op == 99) {
            cin >> idx >> pct; idx--;
            double lft = s[idx] * pct / 100.0, rit = s[idx] - lft;
            s[idx] = lft;
            s.insert(s.begin() + idx + 1, rit);
        }
        if(op == 88) {
            cin >> idx; idx--;
            double lft = s[idx], rit = s[idx+1];
            s[idx] = lft + rit;
            s.erase(s.begin() + idx + 1);
        }
    }
    for(double x : s)
        cout << (int)round(x) << " ";
}