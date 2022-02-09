import sys
input = sys.stdin.readline
cur, ladder, nxt = 1, [54, 90, 99, 9, 40, 67], [19, 48, 77, 34, 64, 86]
while True:
    dice = int(input())
    if not dice:
        break
    if cur + dice <= 100:
        cur += dice
    try:
        cur = nxt[ladder.index(cur)]
    except ValueError:
        pass
    print("You are now on square", cur)
    if cur==100:
        print("You Win!")
        sys.exit(0)
print("You Quit!")