#include <bits/stdc++.h>

using namespace std;

int main()
{
    int n,q,a,b;
    scanf("%d", &n);
    int tree[n];
    scanf("%d", &tree[0]);
    for(int i=1;i<n;i++)
    {
        scanf("%d", &tree[i]);
        tree[i]+=tree[i-1];
    }
    scanf("%d", &q);
    for(int i=0;i<q;i++)
    {
        scanf("%d %d", &a, &b);
        if(a==0)
            printf("%d\n", tree[b]);
        else
            printf("%d\n", tree[b] - tree[a-1]);
            //cout<<tree[b]-tree[a-1]<<endl;
    }
    return 0;
}