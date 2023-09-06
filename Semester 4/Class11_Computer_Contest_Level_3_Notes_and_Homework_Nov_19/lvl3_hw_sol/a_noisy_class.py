import sys
from collections import deque
input = sys.stdin.readline

n, m = int(input()), int(input())
adj = [[] for i in range(n+1)]
indeg = [0] * (n+1)
for i in range(m):
    u, v = map(int, input().split())
    adj[u].append(v)
    indeg[v] += 1
q = deque()
for i in range(1, n+1):
    if indeg[i] == 0:
        q.append(i)
cnt = 0
while q:
    u = q.popleft()
    cnt += 1
    for v in adj[u]:
        indeg[v] -= 1
        if indeg[v] == 0:
            q.append(v)
print('Y') if cnt == n else print('N')