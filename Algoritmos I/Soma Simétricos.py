# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 30/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: retornar uma lista com as somas de todos os valores que ocupem posições simétricas.

# Código:

def soma_simetricos(valores):
    somas = []

    for i in range(len(valores)):
        # Processamento do valor central da lista quando for ímpar:

        if valores[i] == valores[-i-1]:
            soma = valores[i]
            somas.append(soma)
            break

        # Processamento da soma dos números simétricos:

        else:
            soma = valores[i] + valores[-i-1]
            somas.append(soma)
            if len(somas) == len(valores) / 2: break

    return somas

# Testes:

assert soma_simetricos([2, 5, 3, 9]) == [11, 8]

assert soma_simetricos([2, 5, 3, 9, 4]) == [6, 14, 3]

assert soma_simetricos([1, 2, 3, 4, 5, 6, 7]) == [8, 8, 8, 4]

assert soma_simetricos([7]) == [7]

assert soma_simetricos([6, 4]) == [10]

assert soma_simetricos([300, 445, 97]) == [397, 445]

assert soma_simetricos([]) == []
