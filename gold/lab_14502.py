from collections import deque
from itertools import combinations
import sys
input = sys.stdin.readline

dx = [0, 0, 1, -1]
dy = [-1, 1, 0, 0]

def bfs(tmp_lab):       #bfs로 바이러스를 퍼뜨린다
    queue = deque()
            
    for i in range(n):
        for j in range(m):
            if tmp_lab[i][j] == 2:
                queue.append((i, j))
                
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            
            if nx >= 0 and nx < n and ny >= 0 and ny < m:
                if tmp_lab[nx][ny] == 0:
                    tmp_lab[nx][ny] = 2
                    queue.append((nx, ny))
                
    global max_virus
    count = 0
    
    for i in range(n):
        count += tmp_lab[i].count(0)
    max_virus = max(max_virus, count)

def wall():
    for k in range(len(comb)):
        tmp_lab = [item[:] for item in lab]     #이중 리스트 복사
        tmp_lab[comb[k][0][0]][comb[k][0][1]] = 1
        tmp_lab[comb[k][1][0]][comb[k][1][1]] = 1
        tmp_lab[comb[k][2][0]][comb[k][2][1]] = 1
        bfs(tmp_lab)
#
n, m = map(int, input().split())
lab = []
tmp_lab = [[0] * m for i in range(n)]
cc = [] 
for i in range(n):
    lab.append(list(map(int, input().split())))
    for j in range(m):
        if lab[i][j] == 0:
            cc.append((i, j))    
            
comb = list(combinations(cc, 3)) #combination을 이용해 중복되지 않는 3벽 조합을 만들어 시간을 단축
max_virus = 0
wall()

print(max_virus)