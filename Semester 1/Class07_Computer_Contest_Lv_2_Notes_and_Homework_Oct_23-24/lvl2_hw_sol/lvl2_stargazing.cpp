#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pii;
int N; pii t[1002]; set<pii> s;
int main(){
    cin >> N; s.insert(t[1]);
    for(int i=2, x, y, z; i<=N; i++){
        cin >> x >> y >> z;
        t[i] = {t[x].first + y, t[x].second + z};
        s.insert(t[i]);
    }
    cout << s.size() << endl;
}