limiteinferior = 0
limitesuperior = float(input())
nivelatual = float(input())

count = 0

while True:
    if nivelatual >= limitesuperior: break
    evento = input().split()
    tipo = evento[0]
    quantidade = float(evento[1])

    if tipo == 'chuva':
        nivelatual += quantidade

    if tipo == 'afluente':
        nivelatual += quantidade

    if tipo == 'demanda':
        if nivelatual - quantidade > 0:
            nivelatual -= quantidade

print('Açude passou a liberar água.')
print(f'Nível: {nivelatual:.2f}')
