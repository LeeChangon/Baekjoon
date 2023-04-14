T = int(input())

for tc in range(1, T+1):
    a = list(input())

    print("#", tc, sep="", end=" ")
    if int(a[-1]) % 2 == 1:
        print("Odd")
    else:
        print("Even")