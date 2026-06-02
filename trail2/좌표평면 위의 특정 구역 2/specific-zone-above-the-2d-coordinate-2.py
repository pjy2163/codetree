import sys

n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x = [p[0] for p in points]
y = [p[1] for p in points]

answer = sys.maxsize

for i in range(n):
    max_x = -sys.maxsize
    max_y = -sys.maxsize
    min_x = sys.maxsize
    min_y = sys.maxsize
    for j in range(n):
        if j == i:
            continue
        
        x, y = points[j]
        
        max_x = max(max_x, x)
        max_y = max(max_y, y)
        min_x = min(min_x, x)
        min_y = min(min_y, y)

    area = (max_x - min_x) * (max_y - min_y)
    answer = min(answer, area)

print(answer)

