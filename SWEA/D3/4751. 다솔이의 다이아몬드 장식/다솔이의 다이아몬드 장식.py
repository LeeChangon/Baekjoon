T = int(input())

ap = [".#.#.", "#.z.#", ".#.#.", "..#.."]

for tc in range(1, T+1):
    a = input()
    result = ["..#.."]
    for i in a:
        ap[1] = "#." + i + ".#"
        result.extend(ap)

    for i in range(5):
        for j in range(len(result)):
            print(result[j][i], sep="", end="")
        print()