numeros = input().split()
cont = 0

for i in range(len(numeros)-1):
    if numeros[i] == numeros[i+1]:
        cont += 1

print(cont)