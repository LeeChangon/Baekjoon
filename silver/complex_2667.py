import sys
input = sys.stdin.readline

dx = [0, 0, 1, -1]
dy = [1, -1, 0, 0]
cnt = 0

def dfs(x, y):
    global cnt
    visit[x][y] = 1
    cnt += 1
    for i in range(4):
        nx = x + dx[i]
        ny = y + dy[i] 
        if nx < 0 or nx >= n or ny < 0 or ny >= n:
            continue
        if m[nx][ny] == 1 and visit[nx][ny] == 0:
                #visit[nx][ny] = 1
                dfs(nx, ny)

n = int(input())
m = []
visit = [[0] * n for i in range(n)]
for i in range(n):
    m.append(list(map(int, input().rstrip())))
    
result = []    
for i in range(n):
    for j in range(n):
        if m[i][j] == 1 and visit[i][j] == 0:
            cnt = 0
            dfs(i, j)
            result.append(cnt)

print(len(result))
result.sort()
for i in result:
    print(i)