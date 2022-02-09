import sys
input = sys.stdin.readline
s = input().strip()
psa = [[0] for i in range(26)]
for c in s:
    for i in range(26):
        psa[i].append(psa[i][-1])
    if c != ' ':
        psa[ord(c) - ord('a')][-1]+=1
for _ in range(int(input())):
    l, r, c = input().split()
    print(psa[ord(c) - ord('a')][int(r)] - psa[ord(c) - ord('a')][int(l) - 1])