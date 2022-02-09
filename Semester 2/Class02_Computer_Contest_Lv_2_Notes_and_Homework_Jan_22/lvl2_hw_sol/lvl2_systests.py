import sys, bisect
input = sys.stdin.readline
bat = [ ]
for i in range(int(input())):
    bat.append(list(map(int, input().split())))
tests = []
for i in range(int(input())):
    tests.append(int(input()))
tests.sort()
ans = 0
for e in bat:
    pos = bisect.bisect_left(tests, e[0])
    if pos == len(tests) or tests[pos] > e[1]:
        ans += e[2]
print(ans)