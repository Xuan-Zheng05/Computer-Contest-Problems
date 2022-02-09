#include <bits/stdc++.h>
using namespace std;
typedef pair<string, int> psi;
int N, T, x; string s; psi a[12];
int main(){
    cin >> N >> T;
    for(int i=0; i<N; i++){
        cin >> s >> x;
        a[i]=make_pair(s, x);
    }
    sort(a, a+N);
    for(int i=0; i<N; i++)
        for(int j=i+1; j<N; j++)
            for(int k=j+1; k<N; k++)
                if(a[i].second+a[j].second+a[k].second<=T)
                    cout << a[i].first << " " << a[j].first << " " << a[k].first << endl;
}