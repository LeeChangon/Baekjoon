import sys
input = sys.stdin.readline

def dfs(f):
    visit[f] = 1
    for i in range(1, n + 1):
        if visit[i] == 0 and s[f][i] == 1:
            dfs(i)
    

n = int(input())
m = int(input())
s = [[0] * (n + 1) for i in range(n + 1)]
visit = [0 for i in range(n + 1)]
for i in range(m):
    x, y = map(int, input().split())
    s[x][y] = 1
    s[y][x] = 1

dfs(1)

print(sum(visit) - 1)