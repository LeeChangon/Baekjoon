T = int(input())

for tc in range(1, T+1):
    D, H, M = map(int, input().split())
    D = (D - 11) * 1440
    H = (H - 11) * 60
    M = M - 11
    a = D + H + M
    
    print('#', tc, sep='', end=' ')
    
    if a < 0:
        print(-1)
    else:
        print(a)