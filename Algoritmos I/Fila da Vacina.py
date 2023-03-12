sim, nao, mapas = 0, 0, []

while True:
    count = 0
    mapa = input()
    if mapa == '###': break
    mapas.append(mapa)

    while True:
        if count == (len(mapa) - 1): break
        if mapa[count] == 'a':
            if mapa[count + 1] != 'a':
                nao +=1
                break

        count += 1

    sim = len(mapas) - nao

print(f'sim: {sim}')
print(f'não: {nao}')