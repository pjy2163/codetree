n = int(input())
arr = list(map(int, input().split()))

def func(arr):
    for i in arr:
        if(i % 2 == 0):
            i /= 2
        print(int(i), end = ' ')

func(arr)