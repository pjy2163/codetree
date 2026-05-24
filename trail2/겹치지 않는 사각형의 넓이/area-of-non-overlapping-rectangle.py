OFFSET = 1000
MAX_R = 2000

check = [[0] * (MAX_R + 1) for _ in range(MAX_R + 1)]

rects = [tuple(map(int, input().split())) for _ in range(3)]

for idx, (x1, y1, x2, y2) in enumerate(rects):
    x1 += OFFSET
    y1 += OFFSET
    x2 += OFFSET
    y2 += OFFSET

    value = 1 if idx < 2 else 0

    for x in range(x1, x2):
        for y in range(y1, y2):
            check[x][y] = value
            
answer = 0

for row in check:
    answer += sum(row)

print(answer)