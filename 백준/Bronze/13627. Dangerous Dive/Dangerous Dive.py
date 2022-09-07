import sys
input = sys.stdin.readline

N, R = map(int, input().split())
returned = list(map(int, input().split()))
diver = [i for i in range(1, N + 1)]

for i in returned:
    if i in diver:
        diver.remove(i)
if not diver:
    print('*')
else:
    print(*diver)           #괄호 없이 배열 출력