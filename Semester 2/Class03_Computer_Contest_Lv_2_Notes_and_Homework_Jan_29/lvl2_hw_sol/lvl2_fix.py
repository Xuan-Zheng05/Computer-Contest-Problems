import sys
input = sys.stdin.readline
for _ in range(int(input())):
    s = []
    for i in range(3):
        s.append(input().strip())
    fix = False
    for i in range(3):
        for j in range(3):
            if i == j or len(s[i]) < len(s[j]):
                continue
            if s[i][:len(s[j])] == s[j] or s[i][-len(s[j]):] == s[j]:
                fix = True
    print('No') if fix else print('Yes')