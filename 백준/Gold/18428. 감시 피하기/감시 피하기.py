from collections import deque
from itertools import combinations
import sys
input = sys.stdin.readline

dx = [-1, 0, 0, 1]
dy = [0, 1, -1, 0]

def bfs(tmp_room):       #bfs로 감시를 피했는지 확인한다.
    #queue = deque()
            
    #for i in range(n):
    #    for j in range(n):
    #        if tmp_room[i][j] == 'T':     #선생님을 큐에 넣어 탐색
    #            queue.append((i, j))

    for tc in teacher:
        for i in range(4): 
            nx, ny = tc
            while 0 <= nx < n and 0 <= ny < n:
                if tmp_room[nx][ny] == 'O':     #벽이 있다면
                    break
                if tmp_room[nx][ny] == 'S':
                    return True             #감시됨
                if tmp_room[nx][ny] == 'X':
                    tmp_room[nx][ny] = 1
                nx += dx[i]
                ny += dy[i]    
    return False
                

def wall():
    for k in range(len(comb)):
        tmp_room = [item[:] for item in room]     #이중 리스트 복사
        tmp_room[comb[k][0][0]][comb[k][0][1]] = 'O'
        tmp_room[comb[k][1][0]][comb[k][1][1]] = 'O'
        tmp_room[comb[k][2][0]][comb[k][2][1]] = 'O'
        if not bfs(tmp_room):
            return "YES"
                        
    return "NO"
        
n = int(input())
room = []
cc = []
teacher = []
for i in range(n):
    room.append(list(map(str, input().split())))
    for j in range(n):
        if room[i][j] == 'X':
            cc.append((i, j))
        if room[i][j] == 'T':
            teacher.append((i, j))      #선생님 위치 리스트
            
comb = list(combinations(cc, 3))
print(wall())