#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
int R, C, N;
int main(){
    cin >> R >> C;
    vector<vector<int>> a(R, vector<int>(C));  vector<int> row(R);
    for(int i=0; i<R; i++){
        for(int j=0; j<C; j++) cin >> a[i][j];
        row[i] = i;
    }
    cin >> N;
    for(int i=0, col; i<N; i++){
        cin >> col;  col--;
        stable_sort(row.begin(), row.end(), [&](int x, int y){ return a[x][col] < a[y][col]; });
    }
    for(int i=0; i<R; i++){
        int id = row[i];
        for(int j=0; j<C; j++) {
            cout << a[id][j] << " ";
        }
        cout << endl;
    }

}