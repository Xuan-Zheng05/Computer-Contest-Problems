import sys
from collections import deque
input = sys.stdin.readline
m, n, k = int(input()), int(input()), int(input())
row, col = [0]*(m+1), [0]*(n+1)
for _ in range(k):
    op, x = input().split()
    if op == 'R':
        row[int(x)]+=1
    else:
        col[int(x)]+=1
evenr, oddr, evenc, oddc = 0, 0, 0, 0
for i in range(1, m+1):
    if row[i] % 2 == 0:
        evenr+=1
    else:
        oddr+=1
for i in range(1, n+1):
    if col[i] % 2 == 0:
        evenc += 1
    else:
        oddc += 1
print(evenr * oddc + oddr * evenc)