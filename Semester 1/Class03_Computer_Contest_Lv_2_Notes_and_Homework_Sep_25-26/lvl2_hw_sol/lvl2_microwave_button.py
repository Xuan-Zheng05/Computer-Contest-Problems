hour, minute, second = map(int, input().split(':'))
desire = hour*3600 + minute*60 + second
button = list(map(int, input().strip()))
dif, ans = 2e9, ''
for h1 in button:
    for h2 in button:
        for m1 in button:
            for m2 in button:
                for s1 in button:
                    for s2 in button:
                        time = (h1*10+h2)*3600 + (m1*10+m2)*60 + (s1*10+s2)
                        if abs(desire - time) < dif:
                            dif = abs(desire - time)
                            ans = str(h1)+str(h2)+':'+str(m1)+str(m2)+':'+str(s1)+str(s2)
print(ans)