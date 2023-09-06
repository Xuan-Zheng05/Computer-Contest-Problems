import sys
input = sys.stdin.readline
t, n = int(input()), int(input())
a = []
for _ in range(n):
  a.append(int(input()))
a.sort()
ans = 0
for x in a:
  if t >= x:
    ans += 1
    t -= x
print(ans)