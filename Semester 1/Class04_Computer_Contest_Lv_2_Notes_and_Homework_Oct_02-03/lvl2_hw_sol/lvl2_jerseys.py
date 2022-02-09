import sys
input = sys.stdin.readline
j = int(input())
a = int(input())
jerseys = []
an = []
for i in range(j):
    t = input().strip()
    if t == "S":
        t = 1
    elif t == "M":
        t = 2
    else:
        t = 3

    jerseys.append(t)

for i in range(a):
    b = input().split()
    c = int(b[1])
    c -= 1
    d = b[0]
    if d == "S":
        d = 1
    elif d == "M":
        d = 2
    else:
        d = 3
    e = []
    e.append(d)
    e.append(c)
    an.append(e)
ans = 0
used = set()
for i in range(len(an)):
    o = an[i][0]
    p = an[i][1]
    j = jerseys[p]
    if o <= j and p not in used:
        ans += 1
        used.add(p)
print(ans)