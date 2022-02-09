t, n = map(int, input().split())
num = []
for i in range(n):
    num.append(int(input()))
num.sort(key=lambda x: abs(x))
cur, cnt = 0, 0
for i in range(n):
    if abs(num[i] - cur) <= t:
        t -= abs(num[i] - cur)
        cnt += 1
        cur = num[i]
    else:
        break
print(cnt)