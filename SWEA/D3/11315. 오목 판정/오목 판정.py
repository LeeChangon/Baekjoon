T = int(input())
result = []

dx = [0, 1, 1, 1]  # 우 하 우하 좌하
dy = [1, 0, 1, -1]


def chk(b, x, y, d):  # 좌표와 방향을 받는다.
    global cnt
    global answer

    if b[x][y] == 'o':
        cnt += 1
        if cnt >= 5:
            answer = "YES"
        else:
            chk(b, x + dx[d], y + dy[d], d)


for tc in range(T):
    N = int(input())
    board = []
    answer = "NO"

    for i in range(N):
        board.append(list(input()))

    for i in range(N):
        for j in range(N):
            if N - i >= 5:  # 하 탐색
                cnt = 0
                chk(board, i, j, 1)
            if N - j >= 5:  # 우 탐색
                cnt = 0
                chk(board, i, j, 0)
            if N - i >= 5 and N - j >= 5:  # 우하 탐색
                cnt = 0
                chk(board, i, j, 2)
            if j >= 4 and N - i >= 5:  # 좌하 탐색
                cnt = 0
                chk(board, i, j, 3)
    result.append(answer)

for i in range(1, T + 1):
    print("#", i, sep="", end=" ")
    print(result[i - 1])
