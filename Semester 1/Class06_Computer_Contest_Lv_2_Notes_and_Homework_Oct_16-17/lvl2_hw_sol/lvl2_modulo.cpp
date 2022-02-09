#include <bits/stdc++.h>
using namespace std;
 
int main() {
  int a,b,c;
  cin>>a>>b>>c;
  bool z=false;
  for(int i=1;i<=b;i++){
    if((i*a)%b==c){
      z=true;
      break;
    }
  }
  if(z){
    cout<<"YES";
  }
  else{
    cout<<"NO";
  }
}