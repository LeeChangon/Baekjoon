tc = int(input())

for _ in range(tc):
    a = list(map(int, input().split()))[1:] #입력 맨 앞은 개수이기 때문에 생략
    b = list(map(int, input().split()))[1:]
    
    for i in range(4, 0, -1): #4부터 반대로 반복
        if a.count(i) > b.count(i):
            print("A")
            break
        elif a.count(i) < b.count(i):
            print("B")
            break
        if i == 1:
            print("D")  #1의 개수까지 같을 떄 draw반환