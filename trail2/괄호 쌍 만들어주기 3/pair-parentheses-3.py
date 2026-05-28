A = input()
arr = list(A)
length = len(arr)
cnt = 0

#여는 괄호 위치부터 찾고, 인덱스별로 카운트
for i in range(length):
    if arr[i] == '(':
        for j in range(i + 1, length):
            if arr[j] == ')':
                cnt += 1

print(cnt)
