#include <cstdio>
#include <cmath>
#include <iostream>
#include <vector>
using namespace std;
int main(){
   int sensors;
   scanf("%d", &sensors);
   vector<int> freq(1000);
   int highfreq = 0, highfreq2 = 0;
   vector<int> highread, highread2;
   for(int q = 0; q != sensors; ++q){
       int reading;
       scanf("%d", &reading);
       freq[reading]++;
       if(freq[reading] >= highfreq){
           if(freq[reading] > highfreq) highread.clear();
           highfreq = freq[reading];
           highread.push_back(reading);
       }
   }
   for(int q = 0; q != 1000; ++q){
       if(freq[q] >= highfreq2 && freq[q] < highfreq){
           if(freq[q] > highfreq2){
               highread2.clear();
           }
           highfreq2 = freq[q];
           highread2.push_back(q);
       }
   }
   if(highread.size() == 1){
       if(highread2.size() == 1){
           cout << abs(highread[0]-highread2[0]) << endl;

       } else {
           int diff = 0;
           for(vector<int>::iterator q = highread2.begin(); q != highread2.end(); ++q){
               if(abs(*q - highread[0]) > diff) diff = abs(*q-highread[0]);
           }
           cout << diff << endl;
       }
   } else {
       int largest, smallest = 99999999;
       for(vector<int>::iterator q = highread.begin(); q != highread.end(); ++q){
           if(*q > largest) largest = *q;
       }
       for(vector<int>::iterator q = highread.begin(); q != highread.end(); ++q){
           if(*q < smallest && *q < largest){
               smallest = *q;
           }
       }
       cout << abs(largest-smallest) << endl;
   }
   return 0;
}