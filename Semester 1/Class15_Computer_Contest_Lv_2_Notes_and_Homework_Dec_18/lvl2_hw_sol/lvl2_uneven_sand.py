import sys
input = sys.stdin.readline
lo, hi = 1, int(2e9)
while lo <= hi:
    mid = (lo + hi)//2
    print(mid)
    sys.stdout.flush()
    s = input().strip()
    if s == 'FLOATS':
        hi = mid - 1
    elif s == 'SINKS':
        lo = mid + 1
    else:
        break