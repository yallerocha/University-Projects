def bubblesort(lista):

    for j in range(len(lista)):
        houve_troca = False
        for i in range(len(lista) - 1 - j):
            if lista[i] > lista[i + 1]:
                temp = lista[i]
                lista[i] = lista[i + 1]
                lista[i + 1] = temp
                houve_troca = True
        if not houve_troca: return

lista = [1, 5, 3, 7, 2, 9, 0]
bubblesort(lista)
print(lista)