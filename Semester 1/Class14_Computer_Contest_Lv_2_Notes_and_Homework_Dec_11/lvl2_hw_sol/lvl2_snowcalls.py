import sys
import bisect
input = sys.stdin.readline

key = ['', '', 'ABC', 'DEF', 'GHI', 'JKL', 'MNO', 'PQRS', 'TUV', 'WXYZ']
dict = {}
for index, s in enumerate(key):
    for char in s:
        dict[char] = str(index)
for _ in range(int(input())):
    s = input().strip().replace('-', '')
    num = []
    for c in s:
        if c in dict:
            num.append(dict[c])
        else:
            num.append(c)
    ans = "".join(num)
    print(ans[0:3] + '-' + ans[3:6] + '-' + ans[6:10])