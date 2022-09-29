from collections import deque
import sys
input = sys.stdin.readline

dq = deque()
n = int(input())
for i in range(n):
    c = input().split()
    
    if c[0] == "push_back":
        dq.append(c[1])
    elif c[0] == "push_front":
        dq.appendleft(c[1])        
    elif c[0] == "pop_front":
        if len(dq) == 0:
            print(-1)
        else:        
            print(dq.popleft())
    elif c[0] == "pop_back":
        if len(dq) == 0:
            print(-1)
        else:        
            print(dq.pop())    
    elif c[0] == "size":
        print(len(dq))
    elif c[0] == "empty":
        if len(dq) == 0:
            print(1)
        else:
            print(0)
    elif c[0] == "front":
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[0])
    elif c[0] == "back":
        if len(dq) == 0:
            print(-1)
        else:
            print(dq[-1])            