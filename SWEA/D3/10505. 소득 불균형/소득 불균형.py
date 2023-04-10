T = int(input())

for tc in range(1, T+1):
    N = int(input())
    p = list(map(int, input().split()))
    avg = sum(p)//N
    a = 0
    for i in p:
        if i <= avg:
            a += 1
    print("#{} {}".format(tc, a))
