def blefe(lista):
    diferenca = [0] * len(lista)
    for i in range(len(lista) - 1):
        if lista[i] < lista[i + 1]:
            diferenca[i + 1] = lista[i + 1] - lista[i]
            lista[i + 1] = lista[i]

    return diferenca

l1 = [9, 4, 5, 3, 1]
assert blefe(l1) == [0, 0, 1, 0, 0]
assert l1 == [9, 4, 4, 3, 1]

l2 = [15, 9, 4, 5, 2, 1, 3, 4]
assert blefe(l2) == [0, 0, 0, 1, 0, 0, 2, 3]
assert l2 == [15, 9, 4, 4, 2, 1, 1, 1]
