import sys
sys.setrecursionlimit(10000)
input = sys.stdin.readline

n, m, d = map(int, input().split())
edge = [tuple(map(int, input().split())) for i in range(m)]
p = [i for i in range(n+1)]
edge.sort(key=lambda x: x[2], reverse=True)
dest = [int(input()) for i in range(d)]

def find_set(d):   #find leader for dsu containing d
    if d != p[d]:
        p[d] = find_set(p[d])
    return p[d]

ans, i, j = 0, 0, 0
while i < d:
    while find_set(1) != find_set(dest[i]):
        fu, fv = find_set(edge[j][0]), find_set(edge[j][1])
        if fu != fv:
            p[fu] = fv
            ans = edge[j][2]
        j += 1
    i += 1
print(ans)