n = int(input())
x1, x2 = [], []
ans = 0

for _ in range(n):
    a, b = map(int, input().split())
    x1.append(a)
    x2.append(b)

max_x2 = max(x2) + 1
checked = [0] * max_x2

def dfs(idx, cnt):
    global ans

    if idx == n:
        ans = max(ans, cnt)
        return
    
    dfs(idx + 1, cnt)

    start = x1[idx]
    end = x2[idx]

    possible = True

    for x in range(start, end + 1):
        if checked[x]:
            possible = False
        
    if possible:
        for x in range(start, end + 1):
            checked[x] = 1

        dfs(idx + 1, cnt + 1)

        for x in range(start, end + 1):
            checked[x] = 0
    
dfs(0, 0)

print(ans)