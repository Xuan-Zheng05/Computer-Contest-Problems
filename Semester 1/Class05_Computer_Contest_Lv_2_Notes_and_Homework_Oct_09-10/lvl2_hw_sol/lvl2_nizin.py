import sys
from collections import deque
input = sys.stdin.readline

length = int(input())
numbers = input().split()
for t in range(length):
    numbers[t] = int(numbers[t])
q = deque(numbers)
moves = 0
while len(q) > 1:
    if q[0] == q[-1]:
        q.popleft()
        q.pop()
    elif q[0] < q[-1]:
        q[1] += q[0]
        q.popleft()
        moves +=1
    else:
        q[-2] += q[-1]
        q.pop()
        moves += 1
print(moves)