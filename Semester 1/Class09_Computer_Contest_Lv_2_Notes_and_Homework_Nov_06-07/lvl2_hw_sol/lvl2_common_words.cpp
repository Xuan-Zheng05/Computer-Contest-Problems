#include <iostream>
#include <map>
#include <string>
#include <algorithm>
using namespace std;
typedef map<string, int>::iterator mit;
typedef pair<string, int> psi;
struct WORD{string str; int cnt;}dict2[1002];
int n, m, k; string str, out;
bool cmp(WORD a, WORD b){return a.cnt>b.cnt;}
int main(){
    cin >> n;
    while(n--){
        cin >> m >> k;
        map<string, int> dict;
        for(int i=0; i<m; i++){
            cin >> str;
            dict[str]++;
        }
        if((k % 100)>=11 && (k % 100)<=13) out="th";
        else if(k % 10==1) out="st";
        else if(k % 10 == 2) out="nd";
        else if(k % 10 == 3) out ="rd";
        else out="th";
        cout << k << out <<" most common word(s):\n";
        int tot=0;
        for(mit it=dict.begin(); it!=dict.end(); it++){
            dict2[tot].str = it->first;
            dict2[tot++].cnt = it->second;
        }
        if(k>tot) {cout<<endl; continue;}
        sort(dict2, dict2+tot, cmp);
        if(k==1 || dict2[k-1].cnt<dict2[k-2].cnt){
            for(int i=k-1; dict2[i].cnt==dict2[k-1].cnt && i<tot; i++)
                cout << dict2[i].str << endl;
        }
        cout << endl;
    }
}