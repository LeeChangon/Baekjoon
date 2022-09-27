import sys
input = sys.stdin.readline

def binary(i):                  #이분탐색
    first = 0
    end = n - 1

    while first <= end:
        mid = (first + end) // 2
        if a[mid] == i:
            return True
        if i < a[mid]:
            end = mid - 1
        elif i > a[mid]:
            first = mid + 1
            
n = int(input())            
a = list(map(int, input().split()))
m = int(input())
b = list(map(int, input().split()))
a.sort()

for i in range(m):
    if binary(b[i]):
        print(1)
    else:
        print(0)