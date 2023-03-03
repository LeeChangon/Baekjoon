N = int(input())

a = 0

while N >= 0:
    if N % 5 == 0:
        a += N // 5
        break
    N -= 3
    a += 1
else:
    a = -1
print(a)