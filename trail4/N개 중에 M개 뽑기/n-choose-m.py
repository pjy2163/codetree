N, M = map(int, input().split())
arr = []
visited = [False] * (N+1)

def choose(idx):
    if len(arr) == M:
        return print(*arr)
    
    for i in range(idx, N+1):
        if visited[i]:
            continue
        else: 
            arr.append(i)
            visited[i] = True
            choose(i + 1)
            arr.pop()
            visited[i] = False

choose(1)

