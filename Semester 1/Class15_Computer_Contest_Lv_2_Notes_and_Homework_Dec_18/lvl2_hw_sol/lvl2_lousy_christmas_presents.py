import sys
input = sys.stdin.readline
n, m = map(int, input().split())
lst = list(map(int, input().split()))
lft, rit = [-1]*int(1e6+1), [-1]*int(1e6+1)
for i in range(len(lst)):
    color = lst[i]
    if lft[color] == -1:
        lft[color] = i
    rit[color] = i
ans = 0
for i in range(m):
    a, b = map(int, input().split())
    if lft[a] != -1 and rit[b] != -1:
        ans = max(ans, rit[b] - lft[a] + 1)
print(ans)