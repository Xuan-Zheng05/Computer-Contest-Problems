import sys
input = sys.stdin.readline

sz = 1003
cow = [[False] * sz for i in range(sz)]
cnt = [[0] * sz for i in range(sz)]
ans = 0
dir = [(-1, 0), (1, 0), (0, -1), (0, 1)]
for i in range(int(input())):
    x, y = map(int, input().split())
    cow[x][y] = True
    ans += cnt[x][y] == 3
    for dx, dy in dir:
        nx, ny = x + dx, y + dy
        cnt[nx][ny] += 1
        if cnt[nx][ny] == 3 and cow[nx][ny]:
            ans += 1
        if cnt[nx][ny] == 4 and cow[nx][ny]:
            ans -= 1
    print(ans)