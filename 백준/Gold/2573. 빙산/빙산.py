from collections import deque
import sys
input = sys.stdin.readline

dx = [1, -1, 0, 0]
dy = [0, 0 , 1, -1]

def bfs(x, y):
    queue = deque()
    queue.append((x, y))
    visit[x][y] = 1
        
    while queue:
        x, y = queue.popleft()
        
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i] 
            if nx >= 0 and nx < n and ny >= 0 and ny < m:
                if ib[nx][ny] == 0:
                    melt[x][y] += 1                         #각 빙산 주위의 0의 개수를 구해 녹일 양을 정한다
                if ib[nx][ny] != 0 and visit[nx][ny] == 0:
                    queue.append((nx, ny))
                    visit[nx][ny] = 1
    
n, m = map(int, input().split())
ib = []
cnt = 0
year = 0

for i in range(n):
    ib.append(list(map(int, input().split())))

while cnt < 2:
    cnt = 0
    c = 0
    visit = [[0] * m for i in range(n)]
    melt = [[0] * m for i in range(n)]
    
    for i in range(n):
        for j in range(m):
            if ib[i][j] != 0 and visit[i][j] == 0:  #빙산이 있는 부분을 찾아 bfs로 순회
                bfs(i, j)
                cnt += 1
                c += 1
    if cnt >= 2:                                    #빙산의 덩어리가 두개 이상이라면 종료
        print(year)
        break
    if c == 0:
        print(0)            #빙산이 모두 녹을 때까지 두 덩어리로 분리되지 않으면
        break               #0을 출력하고 종료
       
    for i in range(n):
        for j in range(m):
            ib[i][j] = ib[i][j] - melt[i][j]
            if ib[i][j] < 0:
                ib[i][j] = 0
                
    year += 1                        