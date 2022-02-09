import sys
input = sys.stdin.readline

h, m = map(int, input().split(':'))
cur = h * 60 + m
for i in range(120):
    if (7 * 60 <= cur < 10 * 60) or (15 * 60 <= cur < 19 * 60):
        cur += 2
    else:
        cur += 1
h, m = cur // 60 % 24, cur % 60
print("%02d:%02d" % (h, m))