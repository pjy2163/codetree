n = int(input())
arr = []
visited = [False] * (n + 1)

def dfs(curr_num):
    if len(arr) == n:
        print(*arr)
        return
    
    for i in range(1, n+1):
        if visited[i]:
            continue

        visited[i] = True   
        arr.append(i)
        dfs(curr_num + i)
        arr.pop()
        visited[i] = False

dfs(0)

