from itertools import permutations

T = int(input())

for tc in range(1, T+1):
    N = input()
    ll = list(permutations(list(map(int, N)), len(N)))
    arr = []

    flg = 2
    while len(str(int(N) * flg)) <= len(N):
        a = int(N) * flg
        arr.append(list(map(int, str(a))))
        flg += 1
    
    ans = "impossible"
    for i in arr:
        if tuple(i) in ll:
            ans = "possible"

    print("#{} {}".format(tc, ans))