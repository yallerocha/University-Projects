def calcula_digitos_verificacao(cpf):
    soma, multiplicador = 0, 2

    for i in range(len(cpf)-1,-1,-1):
        soma += int(cpf[i]) * multiplicador
        multiplicador += 1

    primeiro = str(10 * soma % 11)
    if primeiro == 10:
        primeiro = 0
    cpf = cpf + primeiro
    soma, multiplicador = 0, 2

    for i in range(len(cpf)-1,-1,-1):
       soma += int(cpf[i]) * multiplicador
       multiplicador += 1

    segundo = str(10 * soma % 11)
    if segundo == 10:
        segundo = 0 

    return primeiro+segundo
