#include <bits/stdc++.h>
using namespace std;
string s; int balance, low;
int main(){
    cin >> s;
    for(int i=0; i<s.size(); i++){
        if(s[i] == '(') balance++;
        else balance--;
        low = min(low, balance);
    }
    if ( low == 0 && balance == 0 || low == 0 && balance == 2 ) printf("YES\n");
    else if(low ==-2 && balance == -2 ) printf("YES\n");
    else printf("NO\n");
}