n, k = map(int, input().split())
commands = [tuple(map(int, input().split())) for _ in range(k)]
list = [0] * n

for i in range(k):
    a, b = commands[i]
    for j in range(a-1, b):
        list[j]+=1

print(max(list))