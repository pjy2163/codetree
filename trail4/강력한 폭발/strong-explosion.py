n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]

bomb_pos = []
for i in range(n):
    for j in range(n):
        if grid[i][j] == 1:
            bomb_pos.append((i,j))

bomb = [
    [(0,0), (-2,0), (-1,0), (1,0), (2,0)],
    [(0,0), (-1,0), (1,0), (0,1), (0,-1)],
    [(0,0), (-1,-1), (-1,1), (1, 1), (1,-1)]
]

selected = [0] * len(bomb_pos)
ans = 0

def dfs(idx):
    global ans

    if idx == len(bomb_pos):
        destroy = [[False]*n for _ in range(n)]

        for i in range(len(bomb_pos)):
            x, y = bomb_pos[i]
            bomb_type = selected[i]

            for dx, dy in bomb[bomb_type]:
                nx = x + dx
                ny = y + dy

                if 0 <= nx < n and 0 <= ny < n:
                    destroy[nx][ny] = True
        
        cnt = 0
        for i in range(n):
            for j in range(n):
                if destroy[i][j]:
                    cnt += 1        
        
        ans = max(ans, cnt)
        return
    
    for bomb_type in range(3):
        selected[idx] = bomb_type
        dfs(idx + 1)

dfs(0)
print(ans)
    