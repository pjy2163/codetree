binary = input()
bin = list(binary)
num = 0

for i in bin:
    num = (2 * num) + int(i)

print(num)

