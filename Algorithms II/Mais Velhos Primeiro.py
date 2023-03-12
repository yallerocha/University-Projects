def idosos_inicio(lista):
    for i in range(len(lista)):
        for j in range(i, len(lista)):
            if lista[j] >= 60:
                temp = lista[i]
                lista[i] = lista[j]
                lista[j] = temp
                break


fila = [25, 33, 67, 61, 35, 8, 12, 15, 22, 63, 75, 30, 34]
idosos_inicio(fila)
assert fila == [67, 61, 63, 75, 35, 8, 12, 15, 22, 25, 33, 30, 34]