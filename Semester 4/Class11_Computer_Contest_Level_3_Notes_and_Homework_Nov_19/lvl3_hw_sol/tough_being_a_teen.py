import sys
from collections import deque
import heapq
input = sys.stdin.readline

n = 7
adj = [[] for i in range(n+1)]
edge = [(1, 7), (1, 4), (2, 1), (3, 4), (3, 5)]
indeg = [0]*(n+1)
for u, v in edge:
    adj[u].append(v)
    indeg[v] += 1
while True:
    u, v = int(input()), int(input())
    if u==0: break
    adj[u].append(v)
    indeg[v] += 1
q, order = [], []
for i in range(1, n+1):
    if indeg[i] == 0:
        heapq.heappush(q, i)
while q:
    u = heapq.heappop(q)
    order.append(u)
    for v in adj[u]:
        indeg[v] -= 1
        if indeg[v] == 0:
            heapq.heappush(q, v)
if len(order) != n:
    print('Cannot complete these tasks. Going to bed.')
else:
    for x in order:
        print(x, end=' ')