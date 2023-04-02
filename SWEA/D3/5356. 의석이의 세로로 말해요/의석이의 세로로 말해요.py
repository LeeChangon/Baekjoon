T = int(input())
result = []

for _ in range(T):
    warr = []
    maxl = 0
    for i in range(5):
        warr.append(list(input()))
        if len(warr[i]) > maxl:
            maxl = len(warr[i])

    vert = []
    for i in range(maxl):
        for j in range(5):
            if len(warr[j]) > i:
                vert.append(warr[j][i])
    result.append(vert)

for i in range(1, T+1):
    print("#", i, sep="", end=" ")
    print(*result[i-1], sep="")