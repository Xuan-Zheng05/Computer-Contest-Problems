#include <bits/stdc++.h>
using namespace std;
struct S{ string name; int p;} s[102];
int N, P;
bool cmp(S a, S b){return a.p > b.p;}
int main(){
    cin >> N >> P;
    for(int i=0; i<N; i++){
        cin >> s[i].name; s[i].p=0;
    }
    for(int i=0; i<P; i++){
        for(int j=0, x=0; j<N; j++){
            cin >> x; s[j].p += x;
        }
    }
    sort(s, s+N, cmp);
    for(int i=0; i<N; i++)
        cout << i+3 << ". " << s[i].name << endl;
}