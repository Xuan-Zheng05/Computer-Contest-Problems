import sys
input = sys.stdin.readline

n = int(input())
print(n//4 * 2 + (n % 4 == 3))
rem = ''
if n % 4 == 1:
    rem = '_'
elif n % 4 == 2:
    rem = '__'
elif n % 4 == 3:
    rem = 'M__'
print('MM__'*(n//4) + rem)