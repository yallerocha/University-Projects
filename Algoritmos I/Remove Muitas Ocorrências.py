def remove_muitas_ocorrencias(lista):

    for i in lista:
        contador = 0
        for c in lista:
            if i == c:
                contador += 1

            if contador >= 3:
                for c in range(len(lista)-1, -1, -1):
                    if lista[c] == i:
                        lista.pop(c)
            

'''lista = [1, 1, 2, 2, 5, 1]
assert remove_muitas_ocorrencias(lista) == None
assert lista == [2, 2, 5]

lista = [1, 2, 1, 2, 1, 1]
assert remove_muitas_ocorrencias(lista) == None
assert lista == [2, 2]'''