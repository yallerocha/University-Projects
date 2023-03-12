def maior_slice(lista):
    sublista, sublistafinal = [], []

    for i in range(1,len(lista)):
        if lista[i] > lista[i-1]:
            if len(sublista) == 0:
                sublista.append(lista[i-1])
                sublista.append(lista[i])
            else:
                sublista.append(lista[i])
        else:
            if len(sublista) >= len(sublistafinal):
                sublistafinal = sublista
                sublista = []
    
    if len(sublistafinal) == 0: 
        return sublista

    else:
        return sublistafinal

assert maior_slice([1, 2, 3, 4, 2, 0, 1]) == [1, 2, 3, 4]
assert maior_slice([7, 6, 2, 9, 10]) == [2, 9, 10]
assert maior_slice([7, 8, 9, 1, 2, 3, 0]) == [1, 2, 3]
