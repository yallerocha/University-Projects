# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 31/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: ordenar uma lista de pedidos

# Código:

def organiza_pedido(lista):

     for j in range(len(lista)):
        houve_troca = False
        for i in range(len(lista) - 1 - j):
            if ord(lista[i]) > ord(lista[i + 1]):
                temp = lista[i]
                lista[i] = lista[i + 1]
                lista[i + 1] = temp
                houve_troca = True
        if not houve_troca: return

l = ['s', 'd', 'd', 'p', 's', 'd', 's']
assert organiza_pedido(l) == None
assert l == ['d', 'd', 'd', 'p', 's', 's', 's']

l2 = ['p', 's', 'd']
assert organiza_pedido(l2) == None
assert l2 == ['d', 'p', 's']