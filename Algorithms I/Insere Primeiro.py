def insere_ordenado_primeiro(lista):

    def empurra_para_esquerda(lista, index):
        for i in range(index):
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



l1 = [5,2,6,9,11,13]
insere_ordenado_primeiro(l1)
assert l1 == [2,5,6,9,11,13]

l2 = [3,1,2,4]
insere_ordenado_primeiro(l2)
assert l2 == [1,2,3,4]

l3 = [1,2,3]
insere_ordenado_primeiro(l3)
assert l3 == [1,2,3]

l4 = [1,0]
insere_ordenado_primeiro(l4)
assert l4 == [0,1]
