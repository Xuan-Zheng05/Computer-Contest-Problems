import sys
input = sys.stdin.readline

cw = ['NE', 'ES', 'SW', 'WN']
ccw = ['NW', 'EN', 'SE', 'WS']
for _ in range(int(input())):
    s = input().strip()
    cw_cnt, ccw_cnt = 0, 0
    for i in range(len(s)-1):
        if s[i] == s[i+1]: continue
        if s[i:i+2] in cw:
            cw_cnt += 1
        else:
            ccw_cnt += 1
    print('CW') if cw_cnt > ccw_cnt else print('CCW')