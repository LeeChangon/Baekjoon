import sys
input = sys.stdin.readline

result_arr = []
t = int(input())
for _ in range(t):
    p = input()           #수행할 함수
    n = int(input())
    tc = input()[1:-2].split(',') #괄호와 쉼표를 제거하고 배열로 만든다
    while '' in tc:
        tc.remove('')
    
    rcnt = 0
    flg = 0
    
    for i in p:
        if i == 'R':
            rcnt += 1        
        elif i == 'D':
            if len(tc) == 0:
                flg = 1
                break
            else:
                if (rcnt % 2) == 1:
                    del tc[-1]
                else:
                    del tc[0]

    if (rcnt % 2) == 1:
        tc.reverse()                #reverse의 시간 복잡도는 리스트길이 N에 대해 O(N)이기 때문에 한 번만 뒤집어 준다
        
    if flg == 1:  
        print("error")
    else:
        print("[" + ",".join(list(tc)) + "]") 