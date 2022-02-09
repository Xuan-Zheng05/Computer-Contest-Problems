#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pi;
int Q, x; deque<pi> q; unordered_map<int, int> mp; char op;
int main(){
    ios::sync_with_stdio(0); cin.tie(0);
    cin >> Q;
    for(int i=1; i<=Q; i++) {
        cin >> op >> x;
        if(op == 'F') {
            q.push_front({x, i});
        }else if(op == 'E') {
            q.push_back({x, i});
        }else {
            mp[x] = i;
        }
    }
    for(pi e : q) {
        if(e.second > mp[e.first])
            cout << e.first << "\n";
    }
}