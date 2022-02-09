import sys

input = sys.stdin.readline

n = int(input())
psa = [0]
for i in range(n):
    psa.append(psa[-1] + int(input()))
for i in range(int(input())):
    l, r, = map(int, input().split())
    print(psa[r+1] - psa[l])