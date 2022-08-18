from collections import deque
import sys
input = sys.stdin.readline

dx = [1, -1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y, h):   
    q = deque()
    q.append((x, y))
    visit[x][y] = 1
    while q:
        x, y = q.popleft()
        
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0 <= nx < n and 0 <= ny < n:
                if g[nx][ny] > h and visit[nx][ny] == 0:
                    q.append((nx, ny))
                    visit[nx][ny] = 1       #bfs는 q에 넣을 때 방문 표시를 해야 시간 복잡도가 망가지지 않는다.

n = int(input())
g = []

for i in range(n):
    g.append(list(map(int, input().split())))
min_v = min(map(min, g))
max_v = max(map(max, g))                    #지역의 최대 높이와 최소 높이를 구한다
result = 1

for h in range(min_v, max_v):       #최소 부터 최대 높이까지 반복
    visit = [[0] * n for _ in range(n)]
    cnt = 0
    for i in range(n):
        for j in range(n):
            if g[i][j] > h and visit[i][j] == 0:
                bfs(i, j, h)        #bfs를 통해 최대 크기의 안전영역 하나를 구해
                cnt += 1            #카운트해준다
    if cnt > result:
        result = cnt                

print(result)