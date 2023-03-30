T = int(input())
result = []

for tc in range(T):
    n = list(input())
    while len(n) > 1:
        sum = 0
        for i in range(len(n)):
            sum += int(n[i])
        n = list(str(sum))
    result.append(n[0])
for i in range(1, T + 1):
    print("#", i, sep="", end=" ")
    print(result[i-1])
