from collections import deque
import sys
input = sys.stdin.readline

dx = [0, 1, -1, 0]
dy = [1, 0, 0, -1]

def bfs():
    while q:
        x, y = q.popleft()
        for i in range(4):
            nx = dx[i] + x
            ny = dy[i] + y
            if 0 <= nx < n and 0 <= ny < m:
                if tomato[nx][ny] == 0:     #익지 않은 토마토
                    tomato[nx][ny] = tomato[x][y] + 1   #1씩 더 해주어 익은 날짜를 계산
                    q.append((nx, ny))
    
m, n = map(int, input().split())
tomato = [list(map(int, input().split())) for _ in range(n)]    #토마토 입력
q = deque()

for i in range(n):
    for j in range(m):
        if tomato[i][j] == 1:
            q.append((i, j))        #익은 토마토를 큐에 삽입
bfs()

day = 0
for i in tomato:
    for j in i:
        if j == 0:
            print(-1)
            exit(0)
    day = max(day, max(i)) #해당 열의 가장 높은 값과 날짜를 비교해 소요된 날을 구한다.

print(day - 1)