from collections import deque

n = int(input())

graph = [[] for i in range(n)]
deg = []
queue = deque()

for i in range(n):
    l = list(map(int,input().split()))
    if len(l) == 1: queue.append(i)
    for x in range(1,len(l)): graph[l[x]-1].append(i)
    deg.append(len(l)-1)

order = []

while queue:
    current = queue.popleft()
    order.append(str(current+1))
    for neighbour in graph[current]:
        deg[neighbour] -= 1
        if deg[neighbour] == 0: queue.append(neighbour)

print(" ".join(order))