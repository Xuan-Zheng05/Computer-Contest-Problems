#include <bits/stdc++.h>

using namespace std;

int main(){
    map<int, int> freq;  //phone num as key and freq as value
    map<int, string> book; //phone num as key and owner's name as value
    int n, d, phone;
    cin >> n;
    int a[n];
    string b[n];
    for (int i = 0; i < n; i++){
        cin >> b[i] >> a[i];
        freq[a[i]]=0; book[a[i]] = b[i];
    }
    cin >> d;
    for (int i = 0; i < d; i++){
        cin >> phone;
        freq[phone]++;
    }
    int maximum = 0;
    string ans;
    for(pair<int, int> p: freq){
        if (p.second > maximum){
            maximum = p.second;
            ans = book[p.first];
        }
    }
    cout << ans;
    return 0;
}