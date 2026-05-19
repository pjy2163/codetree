N = int(input())

def f(N):
    count = 0
    if N == 1:
        return 0

    if N % 2 == 0:
        count+=1
        return f(N // 2) + count
    else:
        count+=1
        return f(N // 3) + count


print(f(N))