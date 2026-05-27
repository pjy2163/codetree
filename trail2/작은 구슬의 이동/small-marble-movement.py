n, t = map(int, input().split())
r, c, d = input().split()
r, c = int(r) - 1, int(c) - 1
mapper = {
    'U' : 0,
    'R' : 1,
    'D' : 2,
    'L' : 3
}

dir = mapper[d]

dxs, dys = [-1, 0, 1, 0], [0, 1, 0, -1]

def in_range(r, c):
    return 0 <= r and r < n and 0 <= c and c < n  

for _ in range(t):
    nr, nc = r + dxs[dir], c + dys[dir]

    if in_range(nr, nc):
        r, c = nr, nc
    else:
        dir = (dir + 2) % 4

print(r + 1, c + 1)