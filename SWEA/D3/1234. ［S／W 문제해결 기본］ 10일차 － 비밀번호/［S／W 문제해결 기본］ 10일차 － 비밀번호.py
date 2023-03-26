for tc in range(1, 11):
    N, pw = map(str, input().split())
    result = []
    for i in pw:
        if result and i == result[-1]:      #i가 방금 result에 삽입된 값과 같다면
            result.pop()                    #연속된 숫자 이므로 정답에서 빼준다.
        else:
            result.append(i)
    print("#", tc, sep="", end=" ")
    print(*result, sep="")