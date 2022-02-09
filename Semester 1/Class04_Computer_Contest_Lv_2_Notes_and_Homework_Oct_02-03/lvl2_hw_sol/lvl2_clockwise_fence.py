import sys
input = sys.stdin.readline
cw_turn = ['NE', 'ES', 'SW', 'WN']
ccw_turn = ['NW', 'EN', 'SE', 'WS']
for _ in range(int(input())):
    s = input().strip()
    cw, ccw = 0, 0
    for i in range(len(s)-1):
        sub = s[i:i+2]
        if sub in cw_turn:
            cw+=1
        elif sub in ccw_turn:
            ccw+=1
    print('CW') if cw > ccw else print('CCW')