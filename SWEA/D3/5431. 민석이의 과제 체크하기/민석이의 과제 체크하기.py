T = int(input())

for tc in range(1, T+1):
    N, K = map(int, input().split())
    std = [i for i in range(1, N+1)]

    a = list(map(int, input().split()))
    for i in a:
        std.remove(i)

    print("#", tc, sep="", end=" ")
    print(*std)
