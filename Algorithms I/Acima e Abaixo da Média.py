soma = 0
quanti = 0
numeros = []

while True:
    num = int(input())
    if num < 0 or soma + num > 100: break
    numeros.append(num)
    soma += num
    quanti += 1

media = soma / quanti

for i in numeros:
    if i > media:
        print(f'{i} > {media:.3f}')
    
    elif i < media:
        print(f'{i} < {media:.3f}')
