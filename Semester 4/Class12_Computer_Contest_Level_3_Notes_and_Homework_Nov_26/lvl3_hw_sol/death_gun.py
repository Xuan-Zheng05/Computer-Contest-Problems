import sys
import heapq
input = sys.stdin.readline
n = int(input())
adj = [[] for i in range(2*n)]
d, name, indeg = {}, [], [0]*(2*n)
for i in range(n):
    a, b = input().split()
    if a not in d:
        d[a] = len(name)
        name.append(a)
    if b not in d:
        d[b] = len(name)
        name.append(b)
    adj[d[b]].append(d[a])
    indeg[d[a]] += 1
q, ans = [], []
for i in range(len(name)):
    if indeg[i] == 0:
        q.append(i)
heapq.heapify(q)
while q:
    cur = heapq.heappop(q)
    ans.append(cur)
    for nxt in adj[cur]:
        indeg[nxt] -= 1
        if indeg[nxt] == 0:
            heapq.heappush(q, nxt)
for i in ans:
    print(name[i])