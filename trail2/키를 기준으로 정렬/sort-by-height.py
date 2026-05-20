n = int(input())
name = []
height = []
weight = []

for _ in range(n):
    n_i, h_i, w_i = input().split()
    name.append(n_i)
    height.append(int(h_i))
    weight.append(int(w_i))

class Info:
    def __init__(self, name, height, weight):
        self.n = name
        self.h = height
        self.w = weight

infos = []

for _ in range(n):
    infos.append(Info(name[_], height[_], weight[_]))


infos.sort(key=lambda x: x.h)

for info in infos:
    print(info.n, info.h, info.w)
