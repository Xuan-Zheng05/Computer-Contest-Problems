import sys
input = sys.stdin.readline

n = int(input())
a = [list(map(int, input().split())) for i in range(n)]
ans, row, col = [], [0]*n, [0]*n
for i in range(n):
    if a[i][0]:
        ans.append(('R', i+1))
        row[i]+=1
for i in range(1, n):
    if a[0][i] + row[0] == 1:
        ans.append(('C', i+1))
        col[i]+=1
cnt = 0
for i in range(n):
    for j in range(n):
        if a[i][j] + (row[i] + col[j]) % 2 == 1:
            cnt += 1
if cnt > 0:
    print(-1)
else:
    print(len(ans))
    for x in ans:
        print(x[0], x[1])