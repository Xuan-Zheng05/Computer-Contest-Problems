#include <bits/stdc++.h>
using namespace std;
typedef pair<int, int> pi;
vector<string> zodiac ={"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};
unordered_map<string, pi> cow;
int n; vector<string> s(8);
int main(){
    cin >> n; cow["Bessie"] = {0, 0};  //{zodiac, age}
    for(int k=1; k<=n; k++){
        for(int i=0; i<s.size(); i++) cin >> s[i];
        string ncow = s[0], ocow = s[7];
        int pos = find(zodiac.begin(), zodiac.end(), s[4]) - zodiac.begin(), dif = 0;
        int opos = cow[ocow].first, oage = cow[ocow].second;
        if(s[3] == "previous") {
            if(opos > pos) dif = opos - pos;
            else dif = 12 + opos - pos;
            cow[ncow] = {pos, oage + dif};
            //cout << ncow << " " << zodiac[pos] << " " << oage + dif << endl;
        }else {
            if(opos >= pos) dif = 12 + pos - opos;
            else dif = pos - opos;
            cow[ncow] = {pos, oage - dif};
            //cout << ncow << " " << zodiac[pos] << " " << oage - dif << endl;
        }
    }
    cout << abs(cow["Bessie"].second - cow["Elsie"].second) << endl;
}