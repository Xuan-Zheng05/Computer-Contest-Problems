import sys
input = sys.stdin.readline
n = int(input())
t = []
for i in range(n):
    t.append(tuple(map(int, input().split())))
ans = float('inf')
for i in range(n):
    for j in range(i+1, n):
        dh, ds = t[i][0] - t[j][0], t[i][1] - t[j][1]
        if dh * ds > 0:
            continue
        if dh == 0:
            ans = 0
        if ds != 0 and dh % ds == 0:
            ans = min(ans, -dh // ds)
print(ans) if ans != float('inf') else print(-1)