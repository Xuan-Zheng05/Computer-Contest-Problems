import sys
input = sys.stdin.readline

n, t = map(int, input().split())
card = []
for _ in range(n):
    card.append(tuple(input().split()))
card.sort()
for i in range(n):
    for j in range(i+1, n):
        for k in range(j+1, n):
            if int(card[i][1]) + int(card[j][1]) + int(card[k][1]) <= t:
                print(card[i][0], card[j][0], card[k][0])