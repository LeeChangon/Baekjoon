import sys
input = sys.stdin.readline

r = ['A', 'B', 'C', 'D', 'E', 'F', 'G', 'H']
c = ['8', '7', '6', '5', '4', '3', '2', '1']

dr = [1, -1, 0, 0, 1, -1, 1, -1]  # R L B T RT LT RB LB
dc = [0, 0, -1, 1, -1, -1, 1, 1]  # 0 1 2 3 4  5  6  7


def mov(d, a, b):
    ar = a[0] + dr[d]
    ac = a[1] + dc[d]

    if [ar, ac] == s:
        br = b[0] + dr[d]
        bc = b[1] + dc[d]
        if 0 <= br < 8 and 0 <= bc < 8:
            b = [br, bc]
        else:
            return a, b
    if 0 <= ar < 8 and 0 <= ac < 8:
        a = [ar, ac]
        return a, b
    else:
        return a, b


K, S, N = map(str, input().split())
k = [r.index(K[0]), c.index(K[1])]
s = [r.index(S[0]), c.index(S[1])]

for _ in range(int(N)):
    M = input().rstrip()
    if M == 'R':
        k, s = mov(0, k, s)
    elif M == 'L':
        k, s = mov(1, k, s)
    elif M == 'T':
        k, s = mov(2, k, s)
    elif M == 'B':
        k, s = mov(3, k, s)
    elif M == 'RT':
        k, s = mov(4, k, s)
    elif M == 'LT':
        k, s = mov(5, k, s)
    elif M == 'RB':
        k, s = mov(6, k, s)
    elif M == 'LB':
        k, s = mov(7, k, s)

print(r[k[0]], c[k[1]], sep='')
print(r[s[0]], c[s[1]], sep='')