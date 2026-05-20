a, b, c, d = map(int, input().split())

h = c - a
m = d - b

if m < 0:
    h = h - 1
    m = 60 + m

print(h * 60 + m)