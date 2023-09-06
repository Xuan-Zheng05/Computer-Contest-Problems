P,Y,T = (map(int,input().split()))
def works(c):
  global P,Y,T
  cur= 0
  for i in range(Y):
    cur += c
    cur = cur * (100 + P) // 100
    if cur >= T:
        return True
  return False
s= 1
e= T
ans = T
while s <= e:
  k = (s+e)//2
  if works(k):
    ans = k
    e = k - 1
  else:
    s = k + 1
print(ans)