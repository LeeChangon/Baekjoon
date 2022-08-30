from collections import deque
import sys
input = sys.stdin.readline

def bfs():
    q = deque()
    visit = [0] * (f + 1)
    q.append(s)
    
    while q:
        cf = q.popleft()
        
        if cf == g:
            return visit[cf]                #목표 층에 도착 했다면 return
        
        for i in (cf - d, cf + u):
            if 0 < i <=f and not visit[i] and i != s:
                visit[i] = visit[cf] + 1
                q.append(i)
                
    return "use the stairs"                 #목표 층에 도달하지 못하고 끝났다면 갈 수 없는 것

f, s, g, u, d = map(int, input().split())

print(bfs())