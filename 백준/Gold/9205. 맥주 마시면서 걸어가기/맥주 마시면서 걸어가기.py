from collections import deque

def bfs():
    q = deque()
    q.append(s)
    while q:
        x, y = q.popleft()
        if abs(x - rfx) + abs(y - rfy) <= 1000:
            print("happy")
            return

        for i in range(n):
            if not visited[i]:
                nx, ny = cs[i]
                if abs(x - nx) + abs(y - ny) <= 1000:
                    visited[i] = 1
                    q.append((nx, ny))
    print("sad")


t = int(input())

for _ in range(t):
    beer = 20
    n = int(input())
    s = map(int, input().split())

    cs = []
    for _ in range(n):
        cx, cy = map(int, input().split())
        cs.append((cx, cy))
    rfx, rfy = map(int, input().split())
    visited = [0 for _ in range(n+1)]

    bfs()