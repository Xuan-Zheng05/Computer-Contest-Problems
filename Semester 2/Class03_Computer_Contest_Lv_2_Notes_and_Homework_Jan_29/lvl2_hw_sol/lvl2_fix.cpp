#include <iostream>
#include <string>
using namespace std;
bool suffix(string a, string b)
{
	if(a.length()>b.length())
		return (0 == a.compare(a.length()-b.length(), b.length(), b));
	else
		return (0 == b.compare(b.length()-a.length(), a.length(), a));
}
bool prefix(string a, string b)
{
	if(a.length()>b.length())
		return (0 == a.compare(0, b.length(), b));
	else
		return (0 == b.compare(0, a.length(), a));
}
int main()
{
	int n;
	cin >> n;
	bool fix;
	string a[3];
	for(int i=0; i<n; i++)
	{
		fix=true;
		cin >> a[0] >> a[1] >> a[2];
		for(int i=0; i<3&&fix; i++)
			for(int j=0; j<3&&fix; j++)
				if(i!=j&&(suffix(a[i],a[j])||prefix(a[i],a[j])))
					fix=false;
		if(fix) cout << "Yes" << endl;
		else 	cout << "No" << endl;
	}
}