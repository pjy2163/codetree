n = int(input())

name = []
score1 = []
score2 = []
score3 = []

for _ in range(n):
    student_input = input().split()
    name.append(student_input[0])
    score1.append(int(student_input[1]))
    score2.append(int(student_input[2]))
    score3.append(int(student_input[3]))

class Student:
    def __init__(self, name, score1, score2, score3):
        self.n = name
        self.s1 = score1
        self.s2 = score2
        self.s3 = score3

students = []

for i in range(n):
    students.append(Student(name[i], score1[i], score2[i], score3[i]))

students.sort(key=lambda x: x.s1 + x.s2 + x.s3)

for a in students:
    print(a.n, a.s1, a.s2, a.s3)