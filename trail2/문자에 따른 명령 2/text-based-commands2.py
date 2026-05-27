dirs = input()
x, y = 0, 0
dx, dy = [1, 0, -1, 0], [0, -1, 0, 1]
arr = list(dirs)
dir_num = 3

for ch in arr:
    if ch == 'L':
        dir_num = (dir_num -1 + 4) % 4
    elif ch == 'R':
        dir_num = (dir_num + 1) % 4
    else:
        nx, ny = x + dx[dir_num], y + dy[dir_num]
        x, y = nx, ny

print(x, y)
        
