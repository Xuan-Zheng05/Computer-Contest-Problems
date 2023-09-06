n,m = map(int, input().split())
parent = [i for i in range(n+1)]
infected = set()
infected.add(1)
def findRoot(node):
    if parent[node] != node:
        parent[node] = findRoot(parent[node])
    return parent[node]

for _ in range(m):
    currClass = list(map(int, input().split()))
    k = currClass.pop(0)
    allinfected = False
    if 1 not in currClass:
        s1 = currClass[0]
        fx = findRoot(s1)
    else:
        fx = 1
        allinfected = True
    for i in range(k):
        s2 = currClass[i]
        fy = findRoot(s2)
        if fx != fy: 
            if fy not in infected:
                parent[fy] = fx
            else:
                parent[fx] = fy
        if allinfected:
            infected.add(s2)

ans = 0
s = ""
for i in range(1, n+1):
    if findRoot(i) in infected:
        ans += 1
        s = s + str(i) + " "

print(ans)
print(s.strip())