A = input()
length = len(A)

def func(A):
    for i in range(length):
        if(A[i] == A[length - 1 - i]):
          continue
        else:
            print("No")
            return
    print("Yes")

func(A)
