from math import floor

n = int(input())
lista = []
inteiros = []

for i in range(n):
   
   lista.append(float(input()))

for i in range(len(lista)):
    if lista[i] - floor(lista[i]) == 0:
        inteiros.append(lista[i])

for i in range(len(inteiros)):

    if i == 0:
        maior = inteiros[0]
        menor = inteiros[0]

    else:
        if inteiros[i] > maior:
          maior = inteiros[i]

        if inteiros[i] < menor:
           menor = inteiros[i]

media = (maior + menor) / 2

abaixo = 0
acima = 0

for i in range(len(lista)):
    if lista[i] > media:
        acima += 1

    elif lista[i] < media:
        abaixo += 1

print(f'Menor número: {menor:.0f}')
print(f'Maior número: {maior:.0f}')
print(f'Média dos extremos: {media:.2f}')
print(f'{abaixo} número(s) abaixo da média')
print(f'{acima} número(s) acima da média')
