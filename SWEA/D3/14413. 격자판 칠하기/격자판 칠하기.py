from collections import deque

dx = [0, -1, 0, 1]
dy = [1, 0, -1, 0]


def bfs(x, y):
    q = deque()
    q.append([x, y])
    visited = []

    while q:
        ax, ay = q.popleft()
        visited.append([ax, ay])

        for i in range(4):
            nx = ax + dx[i]
            ny = ay + dy[i]

            if all([nx >= 0, ny >= 0, nx < N, ny < M]):
                if board[ax][ay] != '?' and [nx, ny] not in visited:
                    if board[nx][ny] == '?':
                        q.append([nx, ny])
                        if board[ax][ay] == '#':
                            board[nx][ny] = '.'
                        else:
                            board[nx][ny] = '#'
                    elif board[nx][ny] == board[ax][ay]:
                        return False
    return True


T = int(input())
for tc in range(1, T + 1):
    N, M = map(int, input().split())
    board = [list(input()) for _ in range(N)]

    result = True
    for i in range(N):
        for j in range(M):
            if board[i][j] != '?':
                result = bfs(i, j)
            if not result:
                break
        if not result:
            break
        # if not result:
        #     break

    print("#", tc, sep='', end=' ')
    print("possible" if result else "impossible")
