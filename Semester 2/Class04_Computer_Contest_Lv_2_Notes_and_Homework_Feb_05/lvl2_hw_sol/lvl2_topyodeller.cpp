#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
using namespace std;
struct y
{
	int n,s,w,r;
};
bool comp(y a, y b)
{
	if(a.s!=b.s)
		return (a.s>b.s);
	else
		return (a.n<b.n);
}
int main()
{
	int n, k;
	vector<y> yodel;
	cin >> n >> k;
	y temp;
	temp.n=1;
	temp.s=0;
	temp.w=0;
	temp.r=0;
	for(int i=0; i<n; i++, temp.n++)
		yodel.push_back(temp);
	int t;
	for(int i=0; i<k; i++)
	{
		for(int j=0; j<n; j++)
		{
			scanf("%d",&t);
			for(int l=0; l<n; l++)
				if(yodel[l].n==j+1)
				{
					yodel[l].s+=t;
					break;
				}
		}
		sort(yodel.begin(),yodel.end(),comp);
		for(int j=0; j<n; j++)
		{
			yodel[j].r=1;
			for(int l=j-1; l>=0; l--)
				if(yodel[l].s>yodel[j].s)
					yodel[j].r++;
			if(yodel[j].r>yodel[j].w)
				yodel[j].w=yodel[j].r;
		}
	}
	for(int i=0; i<n&&yodel[i].r==1; i++)
		cout << "Yodeller " << yodel[i].n << " is the TopYodeller: score " << yodel[i].s << ", worst rank " << yodel[i].w << endl;
}