import sys
input = sys.stdin.readline
from collections import deque

dx = [-1, 0, 1, 0]
dy = [0, 1, 0, -1]
dr = deque([0, 1, 2, 3])     

n = int(input())
a = int(input())

g = [[0] * n for i in range(n)]

x = y = n // 2      #시작 좌표
c = 1
    
while g[0][0] == 0:    
    g[x][y] = c
    
    nx = dx[dr[0]] + x          #진행 방향 좌표
    ny = dy[dr[0]] + y
    cx = dx[dr[1]] + nx         #진행 방향의 오른쪽 좌표
    cy = dy[dr[1]] + ny
    
    if c == a:                  #입력받은 자연수의 좌표
        rx = x + 1
        ry = y + 1

    if g[nx][ny] == 0:
        if g[cx][cy] == 0:      #오른쪽이 비었다면 진행 방향을 바꾼다
            dr.append(dr.popleft())
        c += 1
        x = nx
        y = ny

for i in range(n):
    for j in range(n):
        print(g[i][j], end = ' ')
    print()
    
print(rx, ry)