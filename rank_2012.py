import sys
n = int(sys.stdin.readline().rstrip())
a = []
for i in range(n):
    a.append(int(sys.stdin.readline().rstrip()))
    
a.sort()

c = 0
for i in range(1, n+1):
    c += abs(i - a[i-1])
    
print(c)