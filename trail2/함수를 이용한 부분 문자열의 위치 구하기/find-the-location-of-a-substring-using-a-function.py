text = input()
pattern = input()
length = len(pattern)

def search(text, pattern):
    for i in range(len(text) - length + 1):
        if(text[i:length + i] == pattern):
            return i
        
    return -1

print(search(text, pattern))


