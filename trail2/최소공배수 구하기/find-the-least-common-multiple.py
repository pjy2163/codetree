n, m = map(int, input().split())

def sol(n, m):
    i = 1
    while(True):
        i+=1
        if(i % n == 0 and i % m == 0):
            print(i)
            break  

sol(n, m)