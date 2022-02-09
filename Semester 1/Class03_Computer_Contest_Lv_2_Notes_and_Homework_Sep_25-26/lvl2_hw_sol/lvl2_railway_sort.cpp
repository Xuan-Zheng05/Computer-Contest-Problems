#include <bits/stdc++.h>
using namespace std;
int n;
int main(){
    for(int t=1; t<=10; t++) {
        cin >> n; vector<int> car;
        for(int i=0, x; i<n; i++) {
            cin >> x; car.push_back(x);
        }
        int cost = 0;
        for(int i=n-1; i>=1; i--) {
            auto cur = find(car.begin(), car.end(), i), nxt = find(car.begin(), car.end(), i+1);
            if(cur > nxt) {
                cost += cur - car.begin();
                car.erase(cur);
                car.insert(car.begin(), i);
            }
        }
        cout << cost << endl;
    }
}