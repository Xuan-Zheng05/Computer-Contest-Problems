#include <bits/stdc++.h>
using namespace std;
int main(){
    string s[3] = {"*x*", " xx", "* *"};
    int k;
    cin >> k;
    for(int q=0; q<3; q++){
        for(int i=0; i<k; i++){
            for(int j=0; j<s[q].size(); j++){
                char c = s[q][j];
                for(int p=0; p<k; p++){
                    cout << c;
                }
            }
            cout << endl;
        }
    }
}