import sys
input = sys.stdin.readline
cow = {'Bessie': ['Ox', 0]}
zodiac = {'Ox': 0, 'Tiger': 1, 'Rabbit': 2, 'Dragon': 3, 'Snake': 4, 'Horse': 5, 'Goat': 6, 'Monkey': 7, 'Rooster': 8, 'Dog': 9, 'Pig': 10, 'Rat': 11}
n = int(input())
for i in range(n):
    s = input().strip().split()
    new, ord, year, ref = s[0], s[3], s[4], s[-1]
    if ord == 'previous':
        ref_year = cow[ref][0]
        dif = (zodiac[ref_year] - zodiac[year] + 12)%12
        if dif==0: dif += 12
        cow[new] = [year, cow[ref][1] + dif]
    else:
        ref_year = cow[ref][0]
        dif = (zodiac[year] - zodiac[ref_year] + 12)%12
        if dif==0: dif += 12
        cow[new] = [year, cow[ref][1] - dif]
print(abs(cow['Elsie'][1] - cow['Bessie'][1]))