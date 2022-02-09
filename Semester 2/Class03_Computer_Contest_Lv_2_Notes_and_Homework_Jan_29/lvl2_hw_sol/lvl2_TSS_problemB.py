import sys
from bisect import bisect_right
input = sys.stdin.readline
n, q = map(int, input().split())
dis = [0]*n
for i in range(n):
  x, y = map(int, input().split())
  dis[i] = x*x + y*y
dis.sort()
for i in range(q):
  r = int(input())
  print(bisect_right(dis, r*r))