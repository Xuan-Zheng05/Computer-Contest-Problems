import sys
input = sys.stdin.readline
n = int(input())
ve = []
for i in range(n):
    s = input().split()
    ve.append((s[0], int(s[1])))
q = int(input())
for i in range(q):
    skill, d = map(int, input().split())
    dif, best = int(1e9), ''
    for x in ve:
        if x[1] >= skill and x[1] <= skill + d and x[1] - skill < dif:
            dif = x[1] - skill
            best = x[0]
    if best:
        print(best)
    else:
        print('No suitable teacher!')