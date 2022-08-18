from itertools import product
import sys
input = sys.stdin.readline

n = int(input())
result = []
arr = [1, 2, 3]

for i in range(n):
    a = int(input())
    result.append(1)
    b = []
    for j in range(1, a):
        b = list(product(arr, repeat = j))
        for k in range(len(b)):
            if sum(b[k]) == a:
                result[i] += 1
   
for i in result:
    print(i)
    
