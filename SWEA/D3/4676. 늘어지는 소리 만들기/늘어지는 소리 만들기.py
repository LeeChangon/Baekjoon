T = int(input())

for tc in range(1, T+1):
    a = list(input())
    H = int(input())
    po = list(map(int, input().split()))
    po.sort()
    for i in range(H):
        a.insert(po[i]+i, "-")
    print("#", tc, sep="", end=" ")
    print(*a, sep="")
