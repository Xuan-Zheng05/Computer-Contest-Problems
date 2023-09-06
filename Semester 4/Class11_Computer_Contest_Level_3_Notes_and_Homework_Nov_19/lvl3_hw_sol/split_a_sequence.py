import sys
input = sys.stdin.readline

n, m = map(int, input().split())
a = list(map(int, input().split()))
lo, hi = max(a), sum(a)

def check(limit):
    s, cnt = 0, 1
    for x in a:
        if s + x > limit:
            s, cnt = x, cnt+1
        else:
            s += x
    return cnt <= m

ans = 0
while lo <= hi:
    mid = (lo + hi)//2
    if check(mid):
        ans = mid
        hi = mid - 1
    else:
        lo = mid + 1
print(ans)