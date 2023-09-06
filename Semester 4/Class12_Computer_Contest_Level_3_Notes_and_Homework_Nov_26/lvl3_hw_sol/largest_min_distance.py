import sys
input = sys.stdin.readline

n, m = map(int, input().split())
a = [int(input()) for i in range(n)]
a.sort()

lo, hi, ans = 1, a[-1], 0

def check(x):
    last, cnt = a[0], 1
    for i in range(n):
        if a[i] - last >= x:
            last, cnt = a[i], cnt+1
    return cnt >= m

while lo <= hi:
    mid = (lo + hi)//2
    if check(mid):
        ans, lo = mid, mid+1
    else:
        hi = mid - 1
print(ans)