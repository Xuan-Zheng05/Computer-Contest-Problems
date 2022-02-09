#include <iostream>
#include <string>
using namespace std;

string bob, alice, child;
int n, flag=1;

int main()
{
    cin >> bob >> alice;
    cin >> n;
    while(n--){
        cin >> child;
        flag = 1;
        for(int i=0; i<=4; i++){
            if(child[i]>='A' && child[i]<='E')
                if((bob[2*i]>='A'&&bob[2*i]<='E') || (bob[2*i+1]>='A'&&bob[2*i+1]<='E')
                   || (alice[2*i]>='A'&&alice[2*i]<='E') || (alice[2*i+1]>='A'&&alice[2*i+1]<='E'))
                   continue;
                else {flag=0; break;}
            else
                if(((bob[2*i]>='a'&&bob[2*i]<='e')||(bob[2*i+1]>='a'&&bob[2*i+1]<='e'))
                   &&((alice[2*i]>='a'&&alice[2*i]<='e')||(alice[2*i+1]>='a'&&alice[2*i+1]<='e')))
                   continue;
                else{flag=0; break;}
        }
        if(flag) cout << "Possible baby." << endl;
        else cout << "Not their baby!" << endl;
    }
}