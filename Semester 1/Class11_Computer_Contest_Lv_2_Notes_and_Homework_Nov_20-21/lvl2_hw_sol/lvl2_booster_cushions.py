r, c, k = list(map(int, input().split(" ")))
people = (list(map(int, input().split(" "))))

people.sort(reverse=True)
lo, hi, out = k-1, 0, 0
while lo >= hi:
    first = people[hi]
    hi+=1
    for j in range(1, r):
        if lo < hi:
            break
        out += first - people[lo] + j
        lo -= 1

print(out)