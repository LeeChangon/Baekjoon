from itertools import combinations
import sys
input = sys.stdin.readline

while 1:
    s = list(map(int, input().split()))
    if s[0] == 0:
        break
    s = s[1:]
    comb = list(combinations(s, 6))
    
    for i in range(len(comb)):
        for j in range(len(comb[i])):
            print(comb[i][j], end = " ")
        print()
    print()