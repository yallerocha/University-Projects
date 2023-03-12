def maioridade_penal(nomes, idades):

    maiores = ''

    nomes = nomes.split()
    idades = idades.split()

    for i in range(len(idades)):
        if int(idades[i]) >= 18:

            if len(maiores) == 0:
                maiores = nomes[i]
            else:
                maiores = maiores + ' ' + nomes[i]

    return maiores
