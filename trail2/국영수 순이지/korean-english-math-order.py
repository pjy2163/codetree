n = int(input())
name = []
korean = []
english = []
math = []

for _ in range(n):
    student_info = input().split()
    name.append(student_info[0])
    korean.append(int(student_info[1]))
    english.append(int(student_info[2]))
    math.append(int(student_info[3]))

class Sub:
    def __init__(self, name, korean, english, math):
        self.n = name
        self.k = korean
        self.e = english
        self.m = math

subject = []

for i in range(n):
    subject.append(Sub(name[i], korean[i], english[i], math[i]))

subject.sort(key=lambda x: (-x.k, -x.e, -x.m))

for a in subject:
    print(a.n, a.k, a.e, a.m)
