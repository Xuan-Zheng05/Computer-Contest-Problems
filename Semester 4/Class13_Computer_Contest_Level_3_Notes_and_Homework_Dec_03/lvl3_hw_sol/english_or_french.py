import sys
input = sys.stdin.readline
cntT, cntS = 0, 0
for _ in range(int(input())):
  s = input().strip().lower()
  cntT, cntS = cntT + s.count('t'), cntS + s.count('s')
print('English') if cntT > cntS else print('French')