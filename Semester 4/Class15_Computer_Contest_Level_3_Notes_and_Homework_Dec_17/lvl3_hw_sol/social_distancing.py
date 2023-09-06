import sys
N = int(input())
I = input()
First = I.find('1')
Last = I.rfind('1')
if First == -1:
	print (N-1)
	sys.exit()
intervals = []
Min = N+1
intervals.append(First)
intervals.append(N-1-Last)
Dis2 = max(First // 2, (N-1-Last) // 2)
cur = First
nxt = 0
while (cur < Last):
	nxt = I.find('1', cur+1)
	intervals.append((nxt - cur) // 2)
	Dis2 = max(Dis2, ((nxt - cur) // 3))
	Min = min(Min, nxt - cur)
	cur = nxt
intervals.sort()
ans = max(intervals[-2], Dis2)
print (min(ans, Min))