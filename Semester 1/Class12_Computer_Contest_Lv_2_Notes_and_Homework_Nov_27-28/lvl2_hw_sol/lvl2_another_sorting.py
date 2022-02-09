import sys
input = sys.stdin.readline

n = int(input())
lst = list(map(int, input().split()))
lst.sort(key=lambda x: (x%10, -x))
for x in lst:
    print(x, end=' ')