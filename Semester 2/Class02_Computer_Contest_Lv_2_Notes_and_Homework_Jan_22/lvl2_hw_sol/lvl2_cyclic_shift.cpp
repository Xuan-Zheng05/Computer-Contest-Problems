#include <bits/stdc++.h>
using namespace std;
int main(){
    string s, t;
    cin >> s >> t;
    for(int i=0; i<t.length(); i++){
        string x = t.substr(i) + t.substr(0, i);
        if(s.find(x) != -1){
            cout << "yes" << endl;
            return 0;
        }
    }
    cout << "no" << endl;
}