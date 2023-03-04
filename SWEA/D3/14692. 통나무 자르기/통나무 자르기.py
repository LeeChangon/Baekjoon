TC = int(input())

for t in range(1, TC + 1):
    a = int(input())
    print("#", t, sep="", end=" ")
    if a % 2 == 0:
        print("Alice")
    else:
        print("Bob")