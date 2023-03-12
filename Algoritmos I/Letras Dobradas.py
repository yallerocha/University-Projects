#VARIÁVEIS DE INÍCIO

dobradas, normais, lista = [], [], []        
quantas, quantasn = 0, 0
espacamento, extra = '', ''

#ENTRADAS

n = int(input())

for o in range(n):

    word = input()
    espacamento = ''
    for c in range(len(word)): 
        espacamento = espacamento + ' ' + word[c]

#PROCESSAMENTO

    parada = 0
    extra = ''
    lista = espacamento.split()
    quantasextra = quantas

    for w in lista:
        extra = extra + w

    for d in range(len(lista)-1):
        if lista[d] == lista[d+1] and parada == 0:
            dobradas.append(extra)
            parada = 1
            quantas += 1
    
    if quantas == 0:
        normais.append(extra)
        quantasn += 1

    elif quantas == quantasextra:
        normais.append(extra)
        quantasn += 1

#SAÍDAS

print(f'{quantas} palavra(s) com letras dobradas:')

for i in range(len(dobradas)):
    print(dobradas[i])

print('---')

print(f'{quantasn} palavra(s) sem letras dobradas:')

for i in range(len(normais)):
    print(normais[i])
