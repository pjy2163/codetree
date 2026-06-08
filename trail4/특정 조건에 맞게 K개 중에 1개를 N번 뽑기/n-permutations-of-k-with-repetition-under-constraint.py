K, N = map(int, input().split())
arr = []

def choose(curr_num):
    if curr_num == N:
        print(*arr)
        return

    for num in range(1, K + 1):
        if len(arr) >= 2 and arr[-1] == num and arr[-2] == num:
            continue
        
        arr.append(num)
        choose(curr_num + 1)
        arr.pop()

choose(0)
