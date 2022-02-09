import sys
input = sys.stdin.readline
tp, m = [], {}
for _ in range(int(input())):
    s = input().strip()
    tp.append(s)
    m[s] = []
for i in range(int(input())):
    s = input().strip()
    m[s].append(i+1)
for p in tp:
    for id in m[p]:
        print(id)