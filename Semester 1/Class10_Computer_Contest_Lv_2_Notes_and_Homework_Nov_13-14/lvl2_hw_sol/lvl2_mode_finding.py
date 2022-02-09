import sys
input = sys.stdin.readline
n = int(input())
a = list(map(int, input().split()))
d = {}
for x in a:
    if x not in d:
        d[x] = 1
    else:
        d[x] += 1
ans, mx = 0, 0
for k, v in d.items():
    if v > mx or v==mx and k < ans:
        ans, mx = k, v
print(ans)