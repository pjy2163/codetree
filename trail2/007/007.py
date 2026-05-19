secret_code, meeting_point, time = input().split()
time = int(time)

class Mission:
    def __init__(self, secret_code, meeting_point, time):
        self.s = secret_code 
        self.m = meeting_point
        self.t = time

mission1 = Mission(secret_code, meeting_point, time)

print("secret code :", mission1.s)
print("meeting point :", mission1.m)
print("time :", mission1.t)