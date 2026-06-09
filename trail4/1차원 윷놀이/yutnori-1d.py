n, m, k = map(int, input().split())
nums = list(map(int, input().split()))
arr = [1] * k
answer = 0

def choose(turn):
    global answer

    if turn == n:
        score = 0
    
        for pos in arr:
            if pos == m:
                score +=1
        answer = max(answer, score)
        return

    for i in range(k):
        before = arr[i]

        arr[i] = min(m, arr[i] + nums[turn])
        choose(turn + 1)

        arr[i] = before

choose(0)
print(answer)



