m1, d1, m2, d2 = map(int, input().split())

day = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]

answer = 0

if m1 == m2:
    print(d2-d1+1)
else:
    for i in range(m1, m2 + 1):
        answer = answer + day[i - 1]
    print(answer - (d1-1) - (day[m2 - 1]-d2))

