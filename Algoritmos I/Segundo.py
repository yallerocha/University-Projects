num1 = int(input())
num2 = int(input())
num3 = int(input())
num4 = int(input())

#condições para encontrar o primeiro maior número:

if num1 > num2 and num1 > num3 and num1 > num4:
    maior = num1

elif num2 > num1 and num2 > num3 and num2 > num4:
    maior = num2

elif num3 > num2 and num3 > num1 and num3 > num4:
    maior = num3

elif num4 > num2 and num4 > num3 and num4 > num1:
    maior = num4

#condições para encontrar o primeiro menor número:

if num1 < num2 and num1 < num3 and num1 < num4:
    menor = num1

elif num2 < num1 and num2 < num3 and num2 < num4:
    menor = num2

elif num3 < num2 and num3 < num1 and num3 < num4:
    menor = num3

elif num4 < num2 and num4 < num3 and num4 < num1:
    menor = num4

#condições para encontrar o primeiro número da resposta:

if num1 < maior and num1 > menor:
    prinum = num1

elif num2 < maior and num2 > menor:
    prinum = num2

elif num3 < maior and num3 > menor:
    prinum = num3

elif num4 < maior and num4 > menor:
    prinum = num4

#condições para encontrar o segundo número da resposta:

if num1 != maior and num1 != menor and num1 != prinum:
    segnum = num1

elif num2 != maior and num2 != menor and num2 != prinum:
    segnum = num2

elif num3 != maior and num3 != menor and num3 != prinum:
    segnum = num3

elif num4 != maior and num4 != menor and num4 != prinum:
    segnum = num4

#condições para saber qual é o segundo maior e segundo menor número:

if prinum > segnum:
    segmainum = prinum
    segmennum = segnum

elif segnum > prinum:
    segmainum = segnum
    segmennum = prinum

print(f'O segundo menor número é {segmennum}')
print(f'O segundo maior número é {segmainum}')
