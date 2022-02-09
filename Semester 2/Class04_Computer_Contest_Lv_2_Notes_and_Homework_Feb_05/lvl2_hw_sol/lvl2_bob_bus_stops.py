import sys
import bisect
input = sys.stdin.readline
n, q = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
for i in range(q):
    x, y = map(int, input().split())
    print(bisect.bisect_right(a, y) - bisect.bisect_left(a, x))