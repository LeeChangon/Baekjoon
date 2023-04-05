T = int(input())

for tc in range(1, T+1):
    rect = list(map(int, input().split()))

    a = rect.pop(0)
    if a in rect:
        rect.remove(a)
        a = rect[0]

    print('#{} {}'.format(tc, a))