from itertools import combinations

T = int(input())

for tc in range(1, T+1):
    N, L = map(int, input().split())
    T = []
    K = []
    for _ in range(N):
        t, k = map(int, input().split())
        T.append(t)
        K.append(k)

    if sum(K) <= L:
        mx = sum(T)
    else:
        mx = max(T)

    for i in range(2, N):
        ct = list(combinations(T, i))
        ck = list(combinations(K, i))
        for j in range(len(ct)):
            if sum(ck[j]) <= L and sum(ct[j]) > mx:
                mx = sum(ct[j])

    print("#{} {}".format(tc, mx))