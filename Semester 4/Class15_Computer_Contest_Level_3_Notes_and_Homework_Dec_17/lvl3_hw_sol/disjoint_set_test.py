import sys
sys.setrecursionlimit(1000000)
input = sys.stdin.readline

n, m = map(int, input().split())
p = [i for i in range(n+1)]  # create disjoint sets

def find_set(d):   #find leader for dsu containing d
    if d != p[d]:
        p[d] = find_set(p[d])
    return p[d]
ans = []
for i in range(m):
    u, v = map(int, input().split())
    fu = find_set(u)
    fv = find_set(v)
    if fu != fv:
        p[fu] = fv
        ans.append(i+1)
if len(ans) != n-1:
    print('Disconnected Graph')
else:
    for x in ans:
        print(x)