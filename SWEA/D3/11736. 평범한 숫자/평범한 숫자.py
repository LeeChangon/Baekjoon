T = int(input())

for tc in range(1, T+1):
    N = int(input())

    a = list(map(int, input().split()))
    cnt = 0

    for i in range(1, N - 1):
        mx = max(a[i], a[i-1], a[i+1])
        mn = min(a[i], a[i-1], a[i+1])
        if mx != a[i] and mn != a[i]:
            cnt += 1

    print("#{} {}".format(tc, cnt))