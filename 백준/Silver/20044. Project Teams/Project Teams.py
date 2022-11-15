import sys

input = sys.stdin.readline

n = int(input())
arr = list(map(int, input().split()))

arr.sort()              #정렬을 한 후
result = []
for i in range(len(arr)):
    x = arr[i] + arr[-(i + 1)]      #가장 큰값과 작은값을 더한다
    result.append(x)
print(min(result))