import sys

n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
visited = [False] * n
ans = -sys.maxsize

def dfs(row, total):
    global ans

    if row == n:
        ans = max(ans, total)
        return
    
    for col in range(n):
        if visited[col]:
            continue

        visited[col] = True
        dfs(row + 1, total + grid[row][col])
        visited[col] = False

dfs(0, 0)
print(ans)
            
