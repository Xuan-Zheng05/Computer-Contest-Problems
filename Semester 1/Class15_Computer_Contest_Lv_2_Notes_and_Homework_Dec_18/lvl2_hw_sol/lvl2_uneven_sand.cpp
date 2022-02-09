#include <iostream>

int main() {

    int l=1,r=2e9;
    while(l<=r){
        int m=l+(r-l)/2;
        std::cout<<m<<std::endl;
        std::string s;std::cin>>s;
        std::cout.flush();
        if(s=="SINKS")l=m+1;
        else if(s=="FLOATS")r=m-1;
        else break;
    }
}