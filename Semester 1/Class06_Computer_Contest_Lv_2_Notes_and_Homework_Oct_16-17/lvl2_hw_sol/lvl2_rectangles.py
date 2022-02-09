import sys
input = sys.stdin.readline

n = int(input())
ans = 0
dic = {}
pts = []
for i in range(n):
  x, y = map(int, input().split())
  pts.append((x, y))
  dic[(x, y)]=1
for i in range(n):
  for j in range(i+1, n):
    xi, yi, xj, yj = pts[i][0], pts[i][1], pts[j][0], pts[j][1]
    if (xi, yj) in dic and (xj, yi) in dic:
      ans = max(ans, abs(xi - xj) * abs(yi - yj))  
print(ans)