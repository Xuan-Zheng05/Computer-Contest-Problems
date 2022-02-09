#include <bits/stdc++.h>
using namespace std;
int K, N; deque<string> words[26]; string s; char ch;
int main(){
    cin >> K >> N;
    for(int i=0; i<K; i++) {
        cin >> s;
        words[s[0]-'a'].push_back(s);
    }
    for(int i=0; i<26; i++) {
        sort(words[i].begin(), words[i].end());
    }
    for(int i=0; i<N; i++) {
        cin >> ch;
        int id = ch - 'a';
        cout << words[id].front() << "\n";
        words[id].push_back(words[id].front());
        words[id].pop_front();
    }
}