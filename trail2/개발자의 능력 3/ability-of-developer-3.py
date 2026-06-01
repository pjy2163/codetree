import sys

a = list(map(int, input().split()))

def diff(i, j, k):
    sum1 = a[i] + a[j] + a[k]
    sum2 = sum(a) - sum1
    return abs(sum1 - sum2)

min_diff = sys.maxsize

for i in range(0, 6):
    for j in range(i + 1, 6):
        for k in range(j + 1, 6):
            min_diff = min(min_diff, diff(i, j, k))

print(min_diff)