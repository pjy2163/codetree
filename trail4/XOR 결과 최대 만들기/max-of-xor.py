n, m = map(int, input().split())
A = list(map(int, input().split()))
ans = 0

def dfs(idx, cnt, xor_value):
    global ans

    if cnt == m:
        ans = max(ans, xor_value)
        return
    
    if idx == n:
        return

    dfs(idx + 1, cnt + 1, xor_value ^ A[idx])

    dfs(idx + 1, cnt, xor_value)

dfs(0, 0, 0)
print(ans)
