n = int(input())
arr = []

def find_beauty():
    if len(arr) == n:
        return 1

    cnt = 0

    for num in range(1, 5):

        if len(arr) + num > n:
            continue
        
        arr.extend([num] * num)
        cnt += find_beauty()

        for _ in range(num):
            arr.pop()

    return cnt

print(find_beauty())