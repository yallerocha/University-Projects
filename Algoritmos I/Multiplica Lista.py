def multiplica_lista(n,lista):
    multiplicada = []
    count = 0

    while True:
        if count == n: break
        for i in lista:
            multiplicada.append(i)
        count += 1
        
    return multiplicada
