import sys
input = sys.stdin.readline
n = int(input())
cows =  [[0 for j in range(1003)] for i in range(1003)]
pasture = [[False for j in range(1003)] for i in range(1003)]
comfortable = 0
for i in range(n):
    x, y = list(map(int, input().split(" ")))
    x, y = x+1, y+1
    pasture[x][y] = True
    curLocation = (x, y)
    locations = [(x, y-1), (x, y+1), (x-1, y), (x+1, y)]

    for j in range(4):
        cows[locations[j][0]][locations[j][1]] += 1

    for j in range(4):
        a, b = locations[j]
        if cows[a][b] == 4 and pasture[a][b]:
            comfortable -= 1
        elif cows[a][b] == 3 and pasture[a][b]:
            comfortable += 1

    if cows[x][y] == 3:
        comfortable += 1

    print(comfortable)