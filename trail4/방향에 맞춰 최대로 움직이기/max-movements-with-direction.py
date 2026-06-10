n = int(input())
num = [list(map(int, input().split())) for _ in range(n)]
move_dir = [list(map(int, input().split())) for _ in range(n)]
r, c = map(int, input().split())

answer = 0
cnt = 0

num_type = [(0,0),(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1),(0,-1),(-1,-1)]

def in_range(r,c):
    return 0 <= r < n and 0 <= c < n
        
def dfs(r, c, cnt):
    global answer 

    answer = max(answer, cnt)

    d = move_dir[r][c]
    dr, dc = num_type[d]
    nr = r + dr
    nc = c + dc

    while in_range(nr, nc):
        if num[r][c] < num[nr][nc]:
            dfs(nr, nc, cnt + 1)     
        nr += dr
        nc += dc       

dfs(r-1, c-1, 0)
print(answer)

