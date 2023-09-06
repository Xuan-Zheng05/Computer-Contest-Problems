import sys
input = sys.stdin.readline

maxv = 1000
freq = [0]*(maxv + 1)
for i in range(int(input())):
    freq[int(input())] += 1
mx1 = max(freq)
t = []
for i in range(len(freq)):
    if freq[i] == mx1:
        t.append(i)
if len(t) >= 2:
    print(max(t) - min(t))
else:
    high = t[0]
    mx2 = 0
    t2 = []
    for i in range(len(freq)):
        if freq[i] < mx1 and freq[i] > mx2:
            mx2 = freq[i]
    for i in range(len(freq)):
        if freq[i] == mx2:
            t2.append(i)
    t2.sort()
    print(max(abs(high - t2[0]), abs(high - t2[-1])))