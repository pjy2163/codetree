n, m = map(int, input().split())

d = []
t = []
for _ in range(n):
    direction, time = input().split()
    d.append(direction)
    t.append(int(time))

d2 = []
t2 = []
for _ in range(m):
    direction, time = input().split()
    d2.append(direction)
    t2.append(int(time))

# 격자 배열에 체크하기
cur = 0
check_a = [0]
check_b = [0]

for i in range(n):
    for j in range(t[i]):
        if d[i] == 'R':
            cur += 1
        else:
            cur -= 1
        check_a.append(cur)

cur = 0
for i in range(m):
    for j in range(t2[i]):
        if d2[i] == 'R':
            cur += 1
        else:
            cur -= 1
        check_b.append(cur)

answer = -1
for i in range(1, min(len(check_a), len(check_b))):
    if check_a[i] == check_b[i]:
        answer = i
        break

print(answer)
    