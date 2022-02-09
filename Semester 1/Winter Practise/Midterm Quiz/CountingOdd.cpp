#include <iostream>
#include <string>
using namespace std;

int main() {
   int n;
   cin >> n; 
   
   string temp;
   int oddNum = 0;
   for (int i = 1; i <= n; i++) {  
      std::string temp = std::to_string(i);
      if (temp.size() % 2 == 1) {
         oddNum++;
      }
   }
   cout << oddNum;
   
}