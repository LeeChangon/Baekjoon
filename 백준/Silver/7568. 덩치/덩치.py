import sys
input = sys.stdin.readline

N = int(input())
a = []
for i in range(N):
    a.append(list(map(int, input().split())))
result = [1 for i in range(N)]
for i in range(N):
    for j in range(N):
        if a[j][0] > a[i][0] and a[j][1] > a[i][1]:
            result[i] += 1

print(*result, sep = ' ')