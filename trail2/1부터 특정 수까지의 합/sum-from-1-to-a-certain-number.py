n = int(input())

def func(n):
    sum = 0
    for i in range(1, n + 1):
        sum += i
    return int(sum / 10)

print(func(n))