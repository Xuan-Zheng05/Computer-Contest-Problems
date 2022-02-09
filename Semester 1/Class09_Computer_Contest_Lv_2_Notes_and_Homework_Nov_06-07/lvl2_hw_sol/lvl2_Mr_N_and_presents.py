from collections import deque
import sys
input = sys.stdin.readline
dq = deque()
rem = {}
n = int(input())
for i in range(n):
    op, x = input().strip().split()
    if op == 'F':
        dq.appendleft((int(x), i))
    elif op == 'E':
        dq.append((int(x), i))
    else:
        rem[int(x)] = i
for e in dq:
    if e[0] not in rem or rem[e[0]] < e[1]:
        print(e[0])