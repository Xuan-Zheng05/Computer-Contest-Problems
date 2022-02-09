I, N, Q = int(input()), int(input()), int(input())
dif = [0]*(I+2)
for i in range(Q):
   a = list(map(int, input().split()))
   #print(a)
   dif[a[0]] += a[2]
   dif[a[1]+1] -= a[2]
cnt = 0
for i in range(1, I+1):
    dif[i] += dif[i-1]
    if dif[i] < N :
        cnt+=1
#print(dif)
print(cnt)