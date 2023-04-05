T = int(input())
aeiou = ['a', 'e', 'i', 'o', 'u']

for tc in range(1, T+1):
    word = list(input())
    result = []
    for i in word:
        if i not in aeiou:
            result.append(i)

    print("#", tc, sep='', end=' ')
    print(*result, sep='')