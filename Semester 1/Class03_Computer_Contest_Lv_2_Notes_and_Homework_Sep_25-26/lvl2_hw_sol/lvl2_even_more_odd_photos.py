import sys
input = sys.stdin.readline

n, odd, even = int(input()), 0, 0
for x in list(map(int, input().split())):
    if x % 2 == 0:
        even += 1
    else:
        odd += 1
if odd < even:
    print(2*odd + 1)
elif odd == even:
    print(n)
else:
    dif, rem = odd - even, (odd - even)%3
    if rem == 0:
        print(2*even + dif//3 * 2)
    if rem == 1:
        print(2*even + dif//3 * 2 - 1)
    if rem == 2:
        print(2*even + dif//3 * 2 + 1)