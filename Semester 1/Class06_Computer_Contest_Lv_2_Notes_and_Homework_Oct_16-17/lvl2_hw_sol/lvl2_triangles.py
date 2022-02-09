import sys
input = sys.stdin.readline
n, ans = int(input()), 0
x, y = [], []

for i in range(n):
    px, py = map(int, input().split())
    x.append(px)
    y.append(py)

for i in range(n):
    for j in range(n):
        for k in range(n):
            if x[i] == x[j] and y[i] == y[k]:
                ans = max(ans, abs(y[i] - y[j]) * abs(x[i] - x[k]))

print(ans)