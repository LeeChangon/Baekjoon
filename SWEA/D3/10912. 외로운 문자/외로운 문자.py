T = int(input())

for tc in range(1, T + 1):
    a = list(input())
    
    a.sort()
    i = 0
    while i < len(a) - 1:
        if a[i] == a[i + 1]:
            del a[i + 1]
            del a[i]
        else:
            i += 1
            
    print("#", tc, sep="", end=" ")
    if len(a) == 0:
        print("Good")
    else:
        print(*a, sep="")