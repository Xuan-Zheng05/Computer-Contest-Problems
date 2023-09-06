import sys
sys.setrecursionlimit(1000000)
input = sys.stdin.readline

n, m = map(int, input().split())
p = [i for i in range(n+1)]  # create n disjoint sets
cycle_edge = 0

def find_set(d):   #find leader for dsu containing d
    if d != p[d]:
        p[d] = find_set(p[d])
    return p[d]

for i in range(m):
    u, v = map(int, input().split())
    fu = find_set(u)
    fv = find_set(v)
    if fu != fv:
        p[fu] = fv
    else:
        cycle_edge += 1
print('YES') if cycle_edge <= 1 else print('NO')