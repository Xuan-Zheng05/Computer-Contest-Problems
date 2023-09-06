#include <iostream>
using namespace std;

int main()
{
	int t1, t2, count=2;

    cin >> t1 >> t2;
	while (t1>=t2){
		int t3 = t1 - t2;
		t1 = t2;
		t2 = t3;
		count ++;
	}

	cout << count << endl;
	return 0;
}
