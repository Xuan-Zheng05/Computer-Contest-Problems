#include <bits/stdc++.h>
using namespace std;
int main(){
    int year = 0;
    cin >> year;
    for(int i=year+1; ;i++){
        string s = to_string(i);
        bool flag = true;
        for(int j=0; j<s.length(); j++){
            for(int k=j+1; k<s.length(); k++){
                if(s[j] == s[k]) flag = false;
            }
        }
        if(flag) { cout << i << endl; return 0; }
    }
}