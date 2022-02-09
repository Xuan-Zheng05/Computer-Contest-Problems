#include <bits/stdc++.h>
using namespace std;
string key[10] = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
int main(){
    int n;
    cin >> n;
    for(int k=1; k<=n; k++){
        string s, ans; cin >> s;
        int cnt = 0;
        for(char c: s){
            if(c == '-') continue;
            if(isdigit(c)) ans.push_back(c);
            else {
                for(int i=2; i<=9; i++){
                    if(key[i].find(c) != string::npos){
                        ans.push_back(i+'0');
                        break;
                    }
                }
            }
            cnt++;
            if(cnt == 10) break;
        }
        cout << ans.substr(0, 3) << "-" <<ans.substr(3, 3) << "-" << ans.substr(6) << endl;
    }
}