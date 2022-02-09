s = int(input())
x, y = input().split(' ')
year, mon, day = map(int, x.split('/'))
hour, minute, second = map(int, y.split(':'))
hour -= s
num = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
while hour < 0:
    hour += 24
    day -= 1
    while day <= 0:
        mon -= 1
        if mon <= 0:
            year -= 1
            mon += 12
        day += num[mon]
print("%d/%02d/%02d %02d:%02d:%02d" % (year, mon, day, hour, minute, second))