# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 24/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: verificar duas listas e retornar uma lista com os itens únicos em comum

def unicos_em_comum(seq1, seq2):

    cont1 = 0
    cont2 = 0
    lista1 = []
    lista2 = []
    listafinal = []

    for i in range(len(seq1)):
        for j in range(len(seq1)):
            if seq1[i] == seq1[j]:
                cont1 += 1
        if cont1 == 1:
            lista1.append(seq1[i])
        cont1 = 0

    for i in range(len(seq2)):
        for j in range(len(seq2)):
            if seq2[i] == seq2[j]:
                cont2 += 1
        if cont2 == 1:
            lista2.append(seq2[i])
        cont2 = 0
        
    for i in lista1:
        for j in lista2:
            if i == j:
                listafinal.append(i)

    return listafinal


seq1 = ['A', 'A', 'B', 'C', 'C', 'D']
seq2 = ['Z', 'A', 'C', 'D', 'D']
print(unicos_em_comum(seq1, seq2))