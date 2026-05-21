n = int(input())

answer = []

while True:
    if n < 2:
        answer.append(n)
        break
    
    d = n % 2
    answer.append(d)
    n = n // 2

for i in answer[::-1]:
    print(i,end='')