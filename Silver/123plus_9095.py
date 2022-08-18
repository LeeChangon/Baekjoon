from itertools import product   #중복순열을 이용한다.
import sys
input = sys.stdin.readline

n = int(input())
result = []
arr = [1, 2, 3]

for i in range(n):
    a = int(input())
    result.append(1)        #1을 테스트 케이스 만큼 더하는 경우를 빼고 계산하기 위해 미리 1을 더해준다.
    b = []
    for j in range(1, a):
        b = list(product(arr, repeat = j))
        for k in range(len(b)):
            if sum(b[k]) == a:
                result[i] += 1
   
for i in result:
    print(i)
    
