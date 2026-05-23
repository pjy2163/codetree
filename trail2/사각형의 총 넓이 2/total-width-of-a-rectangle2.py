n = int(input())
x1, y1, x2, y2 = [], [], [], []
arr = [[0] * 201 for _ in range(201)]
offset = 100
for _ in range(n):
    a, b, c, d = map(int, input().split())
    x1.append(a)
    y1.append(b)
    x2.append(c)
    y2.append(d)

    for i in range(a, c):
        for j in range(b, d):
             arr[i+100][j+100] = 1
sum = 0
for i in range(201):
    for j in range(201):
        sum += arr[i][j]

print(sum)
