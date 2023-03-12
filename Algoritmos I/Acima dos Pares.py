n = int(input())
somapares = 0
quantipares = 0
quantimaiores = 0
numeros = []

for i in range(n):
    num = int(input())
    numeros.append(num)

    if num % 2 == 0:
        somapares += num
        quantipares += 1

media = somapares / quantipares

for i in numeros:
    if i > media:
        quantimaiores += 1

print(f'média dos pares: {media}')
print(f'acima da média: {quantimaiores}')
