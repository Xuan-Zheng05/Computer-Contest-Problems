import sys
input = sys.stdin.readline
n = int(input())
while True:
  n += 1
  s = str(n)
  if len(set(list(s))) == len(s):
    print(n)
    break