n = int(input())
grid = [list(map(int, input().split())) for _ in range(n)]
answer = 0
sum = 0

for i in range(n - 2):
    for j in range(n - 2):
        sum = 0

        for r in range(i, i + 3):
            for c in range(j, j + 3):
                sum += grid[r][c]

        answer = max(answer, sum)

print(answer)