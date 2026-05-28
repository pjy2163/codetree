import sys

n = int(input())
A = list(map(int, input().split()))
min_value = sys.maxsize

for i in range(n):
    sum = 0
    for j in range(n):
        diff = abs(j - i)
        sum += diff * A[j]
    min_value = min(min_value, sum)

print(min_value)

