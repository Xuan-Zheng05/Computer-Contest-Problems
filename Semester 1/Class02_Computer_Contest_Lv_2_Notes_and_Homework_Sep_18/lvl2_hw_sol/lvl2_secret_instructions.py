import sys
from collections import deque
input = sys.stdin.readline
dir = ''
while True:
    n = input()
    if int(n) == 99999:
        break
    a, b, c = int(n[0]), int(n[1]), int(n[2:])
    if a+b != 0:
        if (a+b)%2 != 0:
            dir = 'left'
        else:
            dir = 'right'
    print(dir, c)