def check(a):
    cnt = 0
    for i in range(8):
        for j in range(9 - N):
            word = a[i][j:j + N]
            if word == word[::-1]:  # 역순
                cnt += 1
    return cnt

for tc in range(1, 11):
    N = int(input())
    a = []
    cnt = 0
    for i in range(8):
        a.append(input())
    cnt += check(a)

    rotated = []
    for i in range(8):
        line = ""
        for j in range(8):
            line += a[j][i]
        rotated.append(line)
    cnt += check(rotated)

    print("#", tc, sep="", end=" ")
    print(cnt)