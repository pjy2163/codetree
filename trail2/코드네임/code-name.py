MAX_N = 5

codenames = []
scores = []
for _ in range(MAX_N):
    codename, score = input().split()
    codenames.append(codename)
    scores.append(int(score))

class Info:
    def __init__(self, codenames, scores):
        self.c = codenames
        self.s = scores

        
infos = [
    Info(codenames[0], scores[0]),
    Info(codenames[1], scores[1]),
    Info(codenames[2], scores[2]),
    Info(codenames[3], scores[3]),  
    Info(codenames[4], scores[4])
]

min_index = scores.index(min(scores))

info2 = infos[min_index]
print(f"{info2.c} {info2.s}")