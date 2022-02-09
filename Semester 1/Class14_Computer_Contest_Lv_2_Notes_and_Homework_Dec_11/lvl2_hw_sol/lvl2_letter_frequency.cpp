#include <bits/stdc++.h>
using namespace std;
const int MM = 1e6+2;
string s; int q, psa[26][MM];  char c;
int main(){
    getline(cin, s); cin >> q;
    for(int i=1; i<=s.size(); i++){
        for(int j=0; j<26; j++){
            psa[j][i] = psa[j][i-1];
        }
        char c = s[i-1];
        if(c != ' ') psa[c-'a'][i]++;
    }
    for(int i=1, L, R; i<=q; i++){
        cin >> L >> R >> c;
        cout << psa[c-'a'][R] - psa[c-'a'][L-1] << "\n";
    }
}