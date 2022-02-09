#include <bits/stdc++.h>
using namespace std;
#define f first
#define s second
#define lc (rt<<1)
#define rc (rt<<1|1)
#define pb push_back
#define cl(a, b) memset(a, b, sizeof(a))
#define mp(a, b) make_pair((a), (b))
#define all(x) x.begin(),x.end()
typedef long long ll;
typedef pair<int, int> pi;
typedef pair<ll, ll> pl;
typedef pair<pi, int> pii;
typedef vector<int> vi;
typedef vector<ll> vl;
typedef vector<pi> vii;
typedef vector<pl> vll;
typedef vector<pii> viii;
const int inf = 0x3F3F3F3F;
const ll infl = 0x3F3F3F3F3F3F3F3FLL;
const int mod = 1e9 + 7;
typedef pair<string, int> psi;
unordered_map<string, psi> mp; int n; string s[8];
vector<string> year = {"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};
int main(){
    //freopen("test.txt", "r", stdin);
    ios::sync_with_stdio(0), cin.tie(0), cout.tie(0);
    cin >> n; mp["Bessie"] = {"Ox", 0};
    for(int k=1; k<=n; k++){
        for(int i=0; i<8; i++) cin >> s[i];
        string y = s[4], name = s[7];
        int xid = find(year.begin(), year.end(), mp[name].f)-year.begin(), age = mp[name].s;
        if(s[3] == "previous"){
            int cnt = 0;
            while(year[xid] != y){
                xid--; cnt++;
                if(xid < 0) xid += 12;
            }
            if(cnt == 0) cnt = 12;
            mp[s[0]] = {y, age + cnt};
        }else {
            int cnt = 0;
            while(year[xid] != y){
                xid++; cnt++;
                if(xid >= 12) xid-= 12;
            }
            if(cnt == 0) cnt = 12;
            mp[s[0]] = {y, age - cnt};
        }
    }
    cout << abs(mp["Elsie"].s - mp["Bessie"].s) << endl;
}