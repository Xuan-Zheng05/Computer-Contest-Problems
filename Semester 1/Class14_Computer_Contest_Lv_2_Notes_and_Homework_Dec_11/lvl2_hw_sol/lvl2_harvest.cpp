#include<bits/stdc++.h>
using namespace std;
typedef pair<int,int> pi;
long long int n,m,k;
int main(){
    cin >> n >> m >> k;
    long long int takensum[n+2], taken[n+2];
    long long int sum[n+1];
    fill(takensum, takensum + n + 2, 0);
    for(int i = 0; i < m; i++){
        int a,b; cin >> a >> b;
        takensum[a]++;
        takensum[b + 1]--;
    }
    taken[0] = 0;  sum[0] = 0;
    for(int i = 1; i <= n; i++){
        taken[i] = taken[i-1] + takensum[i];
        sum[i] = sum[i-1] + m - taken[i];
    }
    int length = 1e9;
    for(int left = 0, right = 1; right <= n; right ++){
        while(sum[right] - sum[left] >= k){
            length = min(length, right - left);
            left++;
        }
    }
    if(length == 1e9) cout << -1 << endl;
    else cout << length << endl;
}