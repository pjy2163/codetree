N, M, K = map(int, input().split())
student = [int(input()) for _ in range(M)]
arr = [0] * N

found = False

for num in student:
    arr[num - 1] += 1
    if arr[num - 1] == K:
        print(num)
        found = True
        break

if not found:
    print(-1)

