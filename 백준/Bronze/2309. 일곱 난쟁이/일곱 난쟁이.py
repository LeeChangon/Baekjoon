from itertools import combinations
import sys
input = sys.stdin.readline

n = []
for _ in range(9):
   n.append(int(input()))
   
n.sort()
for i in list(combinations(n, 7)):
   if sum(i) == 100:
      for j in i:
         print(j)
      break