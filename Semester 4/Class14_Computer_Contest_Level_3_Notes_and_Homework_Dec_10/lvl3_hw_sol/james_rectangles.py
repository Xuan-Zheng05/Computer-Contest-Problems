import sys
input = sys.stdin.readline
t = int(input())
a = [(0,0)]*t
for i in range(t):
  a[i] = tuple(map(int, input().split()))
b = {}
M, P = int(1e7), int(1e15)
ans = 0
for x in range(len(a)):
  for y in range(x+1, len(a)):
    i = a[x]
    j = a[y]
    m = (i[0]+j[0])*M + (i[1]+j[1])
    d = (i[0]-j[0])**2+ (i[1]-j[1])**2
    m = m*P + d
    if m in b:
      ans += b[m]
      b[m] +=1
    else:
      b[m] = 1
print(ans)