#include <bits/stdc++.h>
using namespace std;
int main(){
    int N, T;
    cin >> T; string t;
    map<string, vector<int> > mp; vector<string> s(T);
    for(int i=0; i<T; i++){
        cin >> s[i];
    }
    cin >> N;
    for(int i=1; i<=N; i++){
        cin >> t;
        mp[t].push_back(i);
    }
    for(int i=0; i<T; i++){
        for(int x: mp[s[i]]) cout << x << "\n";
    }
}