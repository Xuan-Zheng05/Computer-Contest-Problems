#include <bits/stdc++.h>
using namespace std;
string s, ans, vowel="aeiou";
int main(){
    cin >> s;
    for(char c: s){
        int pos = vowel.find(c);
        if(pos != -1){
            ans += c;
        } else {
            ans += c;
            int dis=100; char v;
            for(char d: vowel){
                if(abs(c - d) < dis){
                    dis = abs(c-d); v = d;
                }
            }
            ans += v;
            c++;
            if(c > 'z') c = 'z';
            if(vowel.find(c) != string::npos) c++;
            ans += c;
        }
    }
    cout << ans << endl;
}