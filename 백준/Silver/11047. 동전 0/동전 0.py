import sys
input = sys.stdin.readline

n, k = map(int, input().split())
coin = []
total = 0

for i in range(n):
    coin.append(int(input()))
    
for i in reversed(coin):
    if i <= k:
        total += k // i
        k = k % i
print(total)