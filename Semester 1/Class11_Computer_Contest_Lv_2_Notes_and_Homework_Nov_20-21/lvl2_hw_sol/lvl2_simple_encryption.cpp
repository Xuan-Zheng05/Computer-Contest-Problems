#include <bits/stdc++.h>
using namespace std;
string key, s, t, ans;
int main(){
    getline(cin, key); getline(cin, t);
    for(int i=0; i<t.size(); i++)
        if(isupper(t[i])) s.push_back(t[i]);
    for(int i=0; i<s.size(); i++){
        int p = i % key.size();
        char c = s[i] + key[p] - 'A';
        if(c > 'Z') c -= 26;
        ans.push_back(c);
    }
    cout << ans << endl;
}