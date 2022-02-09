#include <bits/stdc++.h>
using namespace std;
int n, a[5001], cnt = 0; unordered_set<int> st;
int main(){
    cin >> n;
    for(int i=0; i<n; i++){
        cin >> a[i]; st.insert(a[i]);
    }
    sort(a, a+n);
    for(int i=0; i<n; i++){
        if(i > 0 && a[i] == a[i-1]) continue;
        for(int j=i+1; j<n; j++){
            if(j > i+1 && a[j] == a[j-1]) continue;
            if(st.count(a[i]+a[j])) cnt++;
        }
    }
    cout << cnt << endl;
}