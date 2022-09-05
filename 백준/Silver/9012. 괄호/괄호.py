import sys
input = sys.stdin.readline

t = int(input())
 
for tc in range(t):
    n = list(input().rstrip())
    cnt = 0
    
    for i in n:
        if i == "(":
            cnt += 1
        elif i == ")":
            cnt -= 1
        if cnt < 0:
            print("NO")
            break
    if cnt > 0:
        print("NO")
    elif cnt == 0:
        print("YES")