n = int(input())
segments = [tuple(map(int, input().split())) for _ in range(n)]
arr = [0] * 201
offset = 100

for i in range(n):
    a, b = segments[i]
    
    arr[a + offset] += 1
    arr[b + offset] -= 1

cur = 0
answer = 0

for i in range(201):
    cur += arr[i]
    answer = (max(cur, answer))

print(answer)

