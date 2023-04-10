T = int(input())

result = []

for tc in range(T):
	a = list(map(int, input().split()))
	if a[0]/a[1] == a[2]/a[3]:
		result.append("DRAW")
	elif a[0]/a[1] > a[2]/a[3]:
		result.append("ALICE")
	elif a[0]/a[1] < a[2]/a[3]:
		result.append("BOB")

for i in range(1, T+1):
	print("#{} {}".format(i, result[i-1]))