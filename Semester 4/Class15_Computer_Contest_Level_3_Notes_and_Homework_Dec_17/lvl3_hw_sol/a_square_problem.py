n = int(input())

arr = []
for _ in range(n):
    arr.append(list(input().strip()))

def solve(arr):
    for row in arr:
        if len(set(row)) < n:
            return "No"
    for col_idx in range(n):
        col = [arr[row_idx][col_idx] for row_idx in range(n)]
        if len(set(col)) < n:
            return "No"
    first_row = arr[0]
    first_column = [arr[row_idx][0] for row_idx in range(n)]
    if first_row == sorted(first_row) and first_column == sorted(first_column):
        return "Reduced"
    return "Latin"

print(solve(arr))