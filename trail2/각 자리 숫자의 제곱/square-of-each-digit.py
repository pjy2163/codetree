N = int(input())

def multi(N):
    if N == 0:
        return 0
    
    return multi(N // 10) + (N % 10) ** 2

print(multi(N))