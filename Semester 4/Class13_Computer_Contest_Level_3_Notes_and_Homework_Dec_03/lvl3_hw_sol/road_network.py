import sys
from math import sqrt
input = sys.stdin.readline
n, m = map(int, input().split())
pt = []
adj = [[0]*n for i in range(n)]

def dist(a, b):
  return sqrt((a[0] - b[0])**2 + (a[1] - b[1])**2)

for i in range(n):
  pt.append(tuple(map(int, input().split())))
  for j in range(0, i):
    adj[i][j] = adj[j][i] = dist(pt[i], pt[j])
for i in range(m):
  a, b = map(int, input().split())
  adj[a-1][b-1] = adj[b-1][a-1] = 0

dis, vis = [float('inf')]*n, [False]*n
dis[0] = 0
for k in range(n):
  mi, id = float('inf'), -1
  for i in range(n):
    if not vis[i] and dis[i] < mi:
      mi, id = dis[i], i
  if id == -1: break
  vis[id] = True
  for i in range(n):
    if not vis[i] and dis[i] > adj[id][i]:
      dis[i] = adj[id][i]
print('%.2f\n' % sum(dis))