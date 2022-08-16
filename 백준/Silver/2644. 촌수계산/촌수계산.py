from collections import deque
import sys
input = sys.stdin.readline

def bfs(t):
    q = deque()
    q.append(t)
    visit = [0 for i in range(n+1)]
    visit[t] = 1
    
    while q:                
        d = q.popleft()
        for i in g[d]:
            if visit[i] == 0:
                visit[i] = 1
                result[i] = result[d] + 1
                q.append(i)

n = int(input())
p1, p2 = map(int, input().split())
m = int(input())
g = [[] for i in range(n+1)]
result = [0 for i in range(n+1)]

for i in range(m):       
    x, y = map(int, input().split())
    g[x].append(y)
    g[y].append(x)

bfs(p1)
    
if result[p2] != 0:
    print(result[p2])
else:
    print(-1)