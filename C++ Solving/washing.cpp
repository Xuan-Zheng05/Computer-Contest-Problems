#include <stdio.h>
#include <iostream>
using namespace std;
#define MAXN (100000 + 10)
int n;
int l, r, mid;
int k;
int a[MAXN];

// 判断时间为ans是否可行
bool check(int ans)
{
    int now = 0; // 需要烘干机的时间
    for (int i = 0; i < n; ++i)
        if (a[i] > ans)
        {
            now += (a[i] - ans - 1) / (k - 1) + 1;
            // 第i件衣服需要烘干机的时间,注意是(k-1)
            //  [a/k] = (a-1)/k + 1
            if (now > ans)
                return false;
        }
    return true;
}

int main()
{
    freopen("input.txt", "r", stdin);
    cin >> n;
    l = 0;
    r = 0;
    for (int i = 0; i < n; ++i)
    {
        cin >> a[i];
        if (a[i] > r)
        {
            r = a[i];
        }
    }
    scanf("%d", &k);
    if (k == 1)
        printf("%d\n", r);
    else
    {
        while (l <= r)
        {
            mid = (l + r) / 2;
            if (check(mid))
                r = mid - 1;
            else
                l = mid + 1;
        }
        cout << l << endl;
    }
    return 0;
}