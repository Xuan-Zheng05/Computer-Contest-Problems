import sys
import math
input = sys.stdin.readline

R, C = map(int, input().split())
a = []
for i in range(R):
    a.append(list(map(int, input().split())))
for i in range(int(input())):
    col = int(input()) - 1
    a.sort(key = lambda x: x[col])
for row in a:
    print(" ".join(map(str, row)))