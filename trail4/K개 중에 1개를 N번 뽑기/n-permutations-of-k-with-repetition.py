K, N = map(int, input().split())
arr = []

def result(arr):
    if len(arr) == N:
        print(*arr)
        return 
    
    for i in range(1, K+1):
        result(arr + [i])
  

result(arr)

