import sys
input = sys.stdin.readline

n, q = map(int, input().split())
p = [i for i in range(n+1)]

def find_set(d):
    if d != p[d]:
        p[d] = find_set(p[d])
    return p[d]


for i in range(q):
    op, u, v = input().split()
    u, v = int(u), int(v)
    fu, fv = find_set(u), find_set(v)
    if op == 'A':
        p[fu] = fv
    else:
        print('Y') if fu==fv else print('N')