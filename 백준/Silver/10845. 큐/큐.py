from collections import deque
import sys
input = sys.stdin.readline

queue = deque()
n = int(input())
for i in range(n):
    c = input().split()
    
    if c[0] == "push":
        queue.append(c[1])
    elif c[0] == "pop":
        if len(queue) == 0:
            print(-1)
        else:        
            print(queue.popleft())
    elif c[0] == "size":
        print(len(queue))
    elif c[0] == "empty":
        if len(queue) == 0:
            print(1)
        else:
            print(0)
    elif c[0] == "front":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[0])
    elif c[0] == "back":
        if len(queue) == 0:
            print(-1)
        else:
            print(queue[-1])            