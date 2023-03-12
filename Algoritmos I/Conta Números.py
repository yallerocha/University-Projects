contador1 = 0
numeros = []
referencias = []
menorA = 0
entreAB = 0
maiorB = 0

n = int(input())

for i in range(n):
    num = int(input())
    numeros.append(num)

print('---')

for i in range(2):
    refe = int(input())
    referencias.append(refe)

for i in referencias:
    if i == referencias[0]:
        a = i
    if i == referencias[1]:
        b = i

for i in numeros:
    if i < a:
        menorA += 1
    if a < i < b:
        entreAB +=1
    if i > b:
        maiorB += 1

print(f'{menorA} antes')
print(f'{entreAB} entre')
print(f'{maiorB} depois')
