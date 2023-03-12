def noves_fora(lista):

    lista2 = []

    while True:

        num1 = lista.pop(0)
        if len(lista) > 0:
            num2 = lista.pop(0)
        else:
            num2 = 0

        soma = num1 + num2

        if soma > 9:
            valor = soma - 9
        else:
            valor = soma

        lista2.append(valor)

        if len(lista) > 0:
            for i in lista:
                lista2.append(i)

        lista = lista2

        if len(lista) == 1: break

    return(lista[0])
    
print(noves_fora([9, 7, 5, 4, 3, 1]))



'''assert noves_fora([9, 7, 5, 4, 3, 1]) == (2, [[9, 7, 5, 4, 3, 1], 
                                              [7, 5, 4, 3, 1], 
                                              [4, 3, 3, 1], 
                                              [7, 3, 1], 
                                              [1, 1], 
                                              [2]])
assert noves_fora([4]) == (4, [[4]])
assert noves_fora([9]) == (0, [[9], [0]])
assert noves_fora([9, 9]) == (0, [[9, 9], [0]])'''