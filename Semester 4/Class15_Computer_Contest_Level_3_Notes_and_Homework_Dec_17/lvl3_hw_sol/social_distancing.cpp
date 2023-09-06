#include <bits/stdc++.h>
using namespace std;
const int MM = 1e5+2;

int N;
vector<int> v;

bool cmp(int a, int b) {
	return a > b;
}

int main() {
    //freopen("test.txt", "r", stdin);
	cin >> N;
	int pre = 0;
	bool flag = true;
	int gap2 = 0, mi = N+1;
	for (int i = 1; i <= N; i++) {
		char tmp;
		cin >> tmp;
		if (tmp-'0') {
			flag = false;
			if(pre==0) { v.push_back(i-pre); gap2 = (i-pre)/2; }
			else { v.push_back((i-pre)/2); gap2 = max(gap2, (i-pre)/3); mi = min(i-pre, mi);}
			pre = i;
		}
	}
	if(pre!=N) { v.push_back(N-pre); gap2 = max(gap2, (N-pre)/2); }
	sort(v.begin(), v.end(), cmp);

	if (flag) cout << N-1 << '\n';
	else cout << min(mi, max(v[1], gap2)) << '\n';

	return 0;
}