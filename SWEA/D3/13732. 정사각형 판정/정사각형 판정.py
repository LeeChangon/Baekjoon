T = int(input())

def check(x, y):
    board[x][y] = 'c'
    y += 1
    cnt = 1
    while y < N:
        if board[x][y] == '#':
            board[x][y] = 'c'
            cnt += 1
            y += 1
        else:
            break
    return cnt


for tc in range(1, T+1):
    N = int(input())
    board = [list(input()) for _ in range(N)]
    c = []

    for i in range(N):
        for j in range(N):
            if board[i][j] == '#':
                c.append((i, j))
                break

    result = "yes"
    for i in c:
        x, y = i
        if len(c) != check(x, y):
            result = "no"
            break
    if '#' in board:
        result = "no"
    print("#{} {}".format(tc, result))