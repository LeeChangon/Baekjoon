t = int(input())

for _ in range(t):  
    floor = int(input())  # 층 수
    num = int(input())  # 호 수
    farr = [i for i in range(1, num+1)]  # 0층 리스트
    for k in range(floor):  # 층 수 만큼 반복
        for i in range(1, num): 
            farr[i] += farr[i-1]
    print(farr[-1])