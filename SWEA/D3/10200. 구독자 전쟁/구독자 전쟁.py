T = int(input())

for tc in range(1, T+1):
    N, A, B = map(int, input().split())
    mx = 0
    if A + B > N:
        mx = (A + B) - N
    print("#{} {} {}".format(tc, min(A, B), mx))