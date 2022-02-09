import sys
input = sys.stdin.readline
n = int(input())
cows = {"Bessie": ["Ox", 0]}
zodiac = {"Ox": 0, "Tiger": 1, "Rabbit": 2, "Dragon": 3, "Snake": 4, "Horse": 5, "Goat": 6, "Monkey": 7, "Rooster": 8,
          "Dog": 9, "Pig": 10, "Rat": 11}
for i in range(n):
    s = input().strip().split(" ")
    cow, modifier, year, ref = s[0], s[3], s[4], cows[s[-1]]
    if modifier == "previous":
        dif = (zodiac[ref[0]] - zodiac[year] + 12) % 12
        if dif == 0:
            dif += 12
        cows[cow] = [year, ref[1] + dif]
    else:
        dif = (zodiac[year] - zodiac[ref[0]] + 12) % 12
        if dif == 0:
            dif += 12
        cows[cow] = [year, ref[1] - dif]

print(abs(cows["Elsie"][1] - cows["Bessie"][1]))