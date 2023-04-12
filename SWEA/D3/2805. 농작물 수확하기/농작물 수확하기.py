T = int(input())

for tc in range(1, T+1):
    N = int(input())
    farm = []
    total = 0

    for _ in range(N):
        farm.append(list(map(int, input())))
    f = N//2
    for i in range(N):
        if f != 0:
            del farm[i][0:f]
            del farm[i][-f:]
        total += sum(farm[i])
        if i >= N//2:
            f += 1
        else:
            f -= 1

    print("#{} {}".format(tc, total))