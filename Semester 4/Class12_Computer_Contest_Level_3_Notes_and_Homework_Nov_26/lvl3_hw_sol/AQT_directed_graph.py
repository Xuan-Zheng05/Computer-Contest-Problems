import sys
input = sys.stdin.readline

sys.setrecursionlimit(500000)

n, m = map(int, input().split())
adj = [[] for i in range(n+1)]
for i in range(m):
    u, v = map(int, input().split())
    adj[v].append(u)
vis = [0] * (n+1)

def dfs(u, mx):
    vis[u] = mx
    for v in adj[u]:
        if vis[v] == 0:
            dfs(v, mx)

for i in range(n, 0, -1):
    if vis[i] == 0:
        dfs(i, i)
for i in range(n, 0, -1):
    if vis[i] > i:
        print(i, vis[i])
        sys.exit(0)
print(-1)