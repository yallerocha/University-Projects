def retorna_index(seq, valor): # Retorna o index de um determinado valor da lista
    for i in range(len(seq)):
        if seq[i] == valor:
            return i
    return -1


def troca_itens(lista, index_um, index_dois): # Troca de posição de dois itens de uma lista
    backup = lista[index_um]
    lista[index_um] = lista[index_dois]
    lista[index_dois] = backup


def bubblesort(lista): # Organiza uma lista em ordem crescente
    for j in range(len(lista)):
        houve_troca = False
        for i in range(len(lista) - 1 - j):
            if lista[i] > lista[i + 1]:
                temp = lista[i]
                lista[i] = lista[i + 1]
                lista[i + 1] = temp
                houve_troca = True
        if not houve_troca: return


def insere_ordenado_primeiro(lista): # Organiza uma lista, que tem o primeiro item desorganizado, em ordem crescente 

    def empurra_para_esquerda(lista, limite):
        for i in range(limite):
            lista[i] = lista[i+1]

    i_final = len(lista) - 1    
    primeiro = lista[0]

    if lista[0] >= lista[i_final]:
        empurra_para_esquerda(lista, i_final)
        lista[i_final] = primeiro
        return

    for i in range(len(lista)):
        if lista[i] > lista[0]:
            empurra_para_esquerda(lista, i)
            lista[i-1] = primeiro
            return

