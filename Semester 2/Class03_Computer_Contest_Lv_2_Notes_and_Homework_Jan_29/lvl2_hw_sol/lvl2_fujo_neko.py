import sys
import math
input = sys.stdin.readline

R, C = map(int, input().split())
row, col = [False] * R, [False] * C
for i in range(R):
    line = input()
    for j in range(C):
        if line[j] == 'X':
            row[i], col[j] = True, True
for i in range(int(input())):
    c, r = map(int, input().split())
    if row[r-1] or col[c-1]:
        print('Y')
    else:
        print('N')