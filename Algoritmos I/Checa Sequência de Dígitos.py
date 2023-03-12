# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 21/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: checar uma sequência de dígitos e parar quando uma das três condições definidas de parada for atingida.

digitos = input()
limite = int(input())

index = 0
soma = 0
impares = 0
checados = 0

while True:

    if int(digitos[index]) % 2 != 0:
        impares += 1

    soma += int(digitos[index])

    checados += 1

    if impares == 6:
        criterio = '6 ímpares'
        break

    if soma >= limite:
        criterio = 'limite'
        break

    if checados == len(digitos):
        criterio = 'final da sequência'
        break
    
    index += 1

print(f'soma: {soma}')
print(f'números lidos: {checados} de {len(digitos)}')
print(f'critério de parada: {criterio}')
