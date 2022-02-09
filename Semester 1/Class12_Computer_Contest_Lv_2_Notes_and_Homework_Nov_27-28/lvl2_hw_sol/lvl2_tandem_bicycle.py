import sys
input = sys.stdin.readline
n,w = map(int, input().split(" "))
a = (list(map(int,input().split(" "))))
a.sort()
L = 0
R = len(a)-1
ans = 0
while (L<R):
    if a[L]+a[R] <= w:
        ans+=(R-L)
        L+=1
    else:
        R-=1
print(ans)