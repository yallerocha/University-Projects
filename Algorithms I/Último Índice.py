def ultimo_indice(num, lista):
    index = -1
    for i in range(len(lista)):
        if lista[i] == num:
            index = i
    return index

assert ultimo_indice(2, [15,2,13,11,14,2]) == 5
assert ultimo_indice(42, [15,2,13,11,14,2]) == -1