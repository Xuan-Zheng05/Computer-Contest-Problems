n, k = map(int, input().split())
l = []
for i in range(n):
    l.append(list(map(int, input().split())) + [i+1])
l.sort(key=lambda x: -x[0])
l = l[:k]
l.sort(key=lambda x: x[1])
print(l[-1][2])