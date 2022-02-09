n = int(input())
s = set()
loc = [(0,0)]
s.add((0,0))
for i in range(1, n):
    p, dx, dy = map(int, input().split())
    loc.append((loc[p-1][0]+dx, loc[p-1][1]+dy))
    s.add(loc[-1])
print(len(s))