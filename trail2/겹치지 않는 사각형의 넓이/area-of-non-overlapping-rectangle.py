x1 = [0] * 3
y1 = [0] * 3
x2 = [0] * 3
y2 = [0] * 3

x1[0], y1[0], x2[0], y2[0] = map(int, input().split())
x1[1], y1[1], x2[1], y2[1] = map(int, input().split())
x1[2], y1[2], x2[2], y2[2] = map(int, input().split())

a = (x2[0] - x1[0]) * (y2[0] - y1[0])
b = (x2[1] - x1[1]) * (y2[1] - y1[1])

a_width = max(0, min(x2[0], x2[2]) - max(x1[0], x1[2]))
a_height = max(0, min(y2[0], y2[2]) - max(y1[0], y1[2]))

a_double = a_width * a_height

b_width = max(0, min(x2[1], x2[2]) - max(x1[1], x1[2]))
b_height = max(0, min(y2[1], y2[2]) - max(y1[1], y1[2]))

b_double = b_width * b_height

print((a- a_double) + (b - b_double))