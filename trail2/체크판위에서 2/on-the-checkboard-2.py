R, C = map(int, input().split())
grid = [input().split() for _ in range(R)]

cnt = 0

for r1 in range(1, R - 1):
    for c1 in range(1, C - 1):
        if grid[0][0] == grid[r1][c1]:
            continue

        for r2 in range(r1 + 1, R - 1):
            for c2 in range(c1 + 1, C - 1):
                if grid[r1][c1] == grid[r2][c2]:
                    continue

                if grid[r2][c2] == grid[R - 1][C - 1]:
                    continue

                cnt += 1

print(cnt)