import sys
input = sys.stdin.readline

N, K, Q = map(int, input().split())

rot = [list(map(int, input().split())) for i in range(K)]

def fun(R, C):
  for k in range(K - 1, -1, -1):
    if rot[k][0] <= R and R <= rot[k][2] and rot[k][1] <= C and C <= rot[k][3]:
      R, C = rot[k][1] + rot[k][2] - C, R + rot[k][1] - rot[k][0]
  return (R-1)*N + C

for i in range(Q):
    R, C = map(int, input().split())
    print(fun(R, C))