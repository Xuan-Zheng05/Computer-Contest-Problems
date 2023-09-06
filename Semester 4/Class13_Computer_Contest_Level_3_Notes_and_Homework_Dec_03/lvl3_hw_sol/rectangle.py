import sys
input = sys.stdin.readline

pt = set()
n = int(input())
a = [tuple(map(int, input().split())) for i in range(n)]
ans = 0
for p in a:
    pt.add(p)
for i in range(n):
    for j in range(i+1, n):
        xi, yi = a[i]
        xj, yj = a[j]
        if (xi, yj) in pt and (xj, yi) in pt:
            ans = max(ans, abs(xi - xj) * abs(yi-yj))
print(ans)