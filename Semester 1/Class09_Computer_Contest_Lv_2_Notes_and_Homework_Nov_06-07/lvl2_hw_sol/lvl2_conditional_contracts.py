import sys
input = sys.stdin.readline
dict = {}
for i in range(int(input())):
    x = int(input())
    dict[x] = dict.get(x, 0)+1
mx1, mx2 = 0, 0
for x in dict.values():
    if x > mx1:
        mx2, mx1 = mx1, x
    elif x > mx2:
        mx2 = x
print(mx1+mx2)