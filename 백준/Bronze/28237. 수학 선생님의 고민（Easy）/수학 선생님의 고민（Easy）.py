def factorize(n):
    for a in range(1, int(n ** 0.5) + 1):
        if n % a == 0:
            c = n // a
            for b in range(-n-2, n+3):
                if b == 0 or (-(n+2)) % b != 0:
                    continue
                d = -(n+2) // b
                if a*d + b*c == n + 1:
                    return a, b, c, d
                if c*d + a*b == n + 1:
                    return c, b, a, d
    return -1

n = int(input())
res = factorize(n)
if res == -1:
    print(-1)
else:
    print(*res)