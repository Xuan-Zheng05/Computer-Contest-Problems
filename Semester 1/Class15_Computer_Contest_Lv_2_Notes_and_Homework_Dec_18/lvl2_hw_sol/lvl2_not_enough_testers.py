import sys
import bisect
input = sys.stdin.readline
f = [1 for i in range(100001)]
lst = [ [] for i in range(100001)]
lst[1].append(1)
for i in range (2, 100001):
    for j in range(i, 100001, i):
        f[j] += 1
    lst[ f[i] ]. append(i)
T = int(input())
for t in range(T):
    k, a, b = map(int, input().split())
    print(bisect.bisect_left(lst[k], b+1) - bisect.bisect_left(lst[k], a))