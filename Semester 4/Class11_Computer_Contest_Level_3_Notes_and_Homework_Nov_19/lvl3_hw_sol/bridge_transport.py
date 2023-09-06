import sys
input = sys.stdin.readline
w, n = int(input()), int(input())
a = [int(input()) for i in range(n)]
s = 0
for i in range(n):
  if i < 4:
    s += a[i]
  else:
    s += a[i] - a[i-4]
  if s > w:
    print(i)
    sys.exit(0)
print(n)