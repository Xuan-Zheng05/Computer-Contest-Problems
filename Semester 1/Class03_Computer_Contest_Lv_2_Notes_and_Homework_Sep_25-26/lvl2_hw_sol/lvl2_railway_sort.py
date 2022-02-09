for t in range(10):
    n = int(input())
    car = list(map(int, input().split()))
    cost = 0
    for i in range(n-1, 0, -1):
        cur, nxt= car.index(i), car.index(i+1)
        if cur > nxt:
            cost += cur
            car.pop(cur)
            car.insert(0, i)
    print(cost)