n, k = map(int, input().split())
x = []
c = []

for _ in range(n):
    pos, char = input().split()
    x.append(int(pos))
    c.append(char)

placed = [0] * (max(x) + k + 2)

for a in range(len(x)):
    if c[a] == 'G':
        placed[x[a]] = 1
    else:
        placed[x[a]] = 2

max_cnt = 0

# two fair

for i in range(1, max(x) + 1):
    score = 0
    for j in range(i, i+k+1):
        score += placed[j]

    max_cnt = max(max_cnt, score)

print(max_cnt)
    
