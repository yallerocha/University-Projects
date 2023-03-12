# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 30/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: receber sequências de numéricas e verificar se são válidas de acordo com a quantidade de números pares e ímpares.

# Código:

sequencias_lidas = 0
invalidas = 0

while True:
    linha = input()

    # Saída do código:

    if linha == 'fim':
        print(f'sequências lidas: {sequencias_lidas} (inválidas: {invalidas})')
        break

    sequencias_lidas += 1
    numeros = linha.split()

    # Verificação de números pares e ímpares:

    par = 0
    impar = 0

    for num in numeros:
        if int(num) % 2 == 0:
            par += 1
        else:
            impar += 1

    # Verificação da validade da linha:

    if par <= impar:
        print(f'linha {sequencias_lidas} inválida: {linha}')
        invalidas += 1
    