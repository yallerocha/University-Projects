def diferenca_listas(lista1, lista2):
    
    if len(lista1) >= len(lista2):
        num = len(lista1)
    else:
        num = len(lista2)

    for x in range(num):
        vav = 1
        for i in range(len(lista2)):
            for j in range(len(lista1)):
                if lista2[i] == lista1[j]:
                    lista1.pop(j)
                    vav = vav * -1
                    break

            if vav == -1: break

    return lista1

lista1 = [1, 2]
lista2 = [1, 2]
diferenca_listas(lista1, lista2) == []
assert lista1 == []

lista1 = [1, 3, 4]
lista2 = [4]
diferenca_listas(lista1, lista2) == [1, 3] 
assert lista1 == [1, 3]