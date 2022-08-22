import sys
input = sys.stdin.readline

n = int(input())
card = set(map(int, input().split()))   #list 대신 set 사용
m = int(input())                        #list를 사용하면 모든 요소를 처음부터 검사하면서 찾지만
cmp = list(map(int, input().split()))   #set은 해시로 구현되어 있으므로
result = [0 for i in range(len(cmp))]   #in 을 사용할 때 일반적으로 더 빨리 작동합니다

for i in range(len(cmp)):
    if cmp[i] in card:
        print(1, end = ' ')
    else:
        print(0, end = ' ')

