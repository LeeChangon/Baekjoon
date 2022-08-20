import sys
n = int(sys.stdin.readline().rstrip())
k = int(sys.stdin.readline().rstrip())
sc = sorted(list(map(int, sys.stdin.readline().rstrip().split())))

dist=[]
for i in range(1, n):
    dist.append(sc[i] - sc[i-1])
dist.sort()

print(sum(dist[:n-k]))