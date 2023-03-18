def compara_senhas(senha1, senha2):
    contador = 0
    for i in range(len(senha1)):
        for c in range(len(senha2)):
            if i == c:
                if senha1[i] != senha2[c]:
                    contador += 1
                    break
    return contador        


'''assert compara_senhas('nome123', 'nome') == 0
assert compara_senhas('aaa', 'bbb') == 3
assert compara_senhas('senha', 'Senha') == 1'''
