from collections import deque

dx = [1, -1, 0, 0]
dy = [0, 0, 1, -1]

def bfs(a, b):
    q = deque()
    q.append((a, b))
    visited[a][b] = 1
    while q:
        x, y = q.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < N and 0 <= ny < N:
                if visited[nx][ny] == 0 and color[nx][ny] == color[x][y]:
                    visited[nx][ny] = 1
                    q.append((nx, ny))


N = int(input())
color = [list(input()) for _ in range(N)]
visited = [[0] * N for _ in range(N)]

cnt1 = 0
cnt2 = 0
for i in range(N):
    for j in range(N):
        if visited[i][j] == 0:
            bfs(i, j)
            cnt1 += 1
            if color[i][j] == 'R' and visited[i][j] == 1:
                color[i][j] = 'G'

for i in range(N):
    for j in range(N):
        if color[i][j] == 'R':
            color[i][j] = 'G'       #빨간색을 초록색으로 전부 바꿔줌

visited = [[0] * N for _ in range(N)]
for i in range(N):
    for j in range(N):
        if visited[i][j] == 0:
            bfs(i, j)
            cnt2 += 1

print(cnt1)
print(cnt2)