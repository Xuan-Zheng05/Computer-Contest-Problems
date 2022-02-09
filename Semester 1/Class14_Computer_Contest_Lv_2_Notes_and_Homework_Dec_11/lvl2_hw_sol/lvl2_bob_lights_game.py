import sys
input = sys.stdin.readline
n, m = map(int, input().split())
a = [0]*(n+2)
for i in range(m):
    l, r = map(int, input().split())
    a[l] += 1
    a[r+1] -= 1
ans = 0
for i in range(1, n+1):
    a[i] += a[i-1]
    if a[i] % 2 != 0:
        ans+=1
print(ans)