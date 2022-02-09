import sys
input = sys.stdin.readline
n, k = map(int, input().split())
empty, student = [False]*(n+1), [0]*(n+1)
a = list(map(int, input().split()))
for x in a:
    empty[x] = True
a = list(map(int, input().split()))
for idx, x in enumerate(a):
    student[x] = idx + 1
stk = []
for p in range(2):
    for i in range(1, n+1):
        if student[i] != 0:
            stk.append(student[i])
            student[i] = 0
        if empty[i] and len(stk) > 0:
            stk.pop()
            empty[i] = False
print(stk.pop())