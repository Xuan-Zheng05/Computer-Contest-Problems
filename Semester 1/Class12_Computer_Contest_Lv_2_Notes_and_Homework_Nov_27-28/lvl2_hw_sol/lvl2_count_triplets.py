import sys
input = sys.stdin.readline
n = int(input())
nums = list(map(int, input().split()))
sums = set(nums)
results = set()
for i in range(n):
    for j in range(i+1, n):
        if nums[i] + nums[j] in sums:
            a = sorted((nums[i], nums[j], nums[i]+nums[j]))
            results.add(a[0]*10000000+a[1])
print(len(results))