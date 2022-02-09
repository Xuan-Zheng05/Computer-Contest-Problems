import sys
from functools import cmp_to_key
input = sys.stdin.readline

def mycmp(a, b):
    ab, ba = a+b, b+a
    return -1 if ab > ba else 1

lst = []
for _ in range(int(input())):
    lst.append(input().strip())
lst.sort(key = cmp_to_key(mycmp))
print(''.join(lst), end='')