#include <bits/stdc++.h>
using namespace std;
int M, N, K; deque<int> dq;
int main(){
    cin >> M >> N >> K;
    for(int i=0, x; i<K; i++){
        cin >> x; dq.push_back(x);
    }
    sort(dq.begin(), dq.end());
    long long sum = 0;
    while(!dq.empty()){
        int f = dq.back(); dq.pop_back();
        for(int row=1; !dq.empty() && row<M; row++){
            int cur = dq.front(); dq.pop_front();
            sum += f - cur + row;
        }
    }
    cout << sum << endl;
}