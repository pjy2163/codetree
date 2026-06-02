import sys

n = int(input())
points = [tuple(map(int, input().split())) for _ in range(n)]
x = [p[0] for p in points]
y = [p[1] for p in points]

answer = sys.maxsize

for i in range(n):
    x1, y1 = points[i]

    for j in range(i+1, n):
        x2, y2 = points[j]
        dx = x2 - x1 
        dy = y2 - y1
        new_dist = (dx * dx) + (dy * dy)
        answer = min(answer, new_dist)

print(answer)
