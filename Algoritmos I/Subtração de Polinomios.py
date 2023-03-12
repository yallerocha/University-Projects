def subtrai_polinomios(p1, p2):
    
    lista = []

    if len(p1) < len(p2): 
        menor = p1
        maior = p2
    elif len(p2) < len(p1): 
        menor = p2
        maior = p1
    else:
        menor = p1
        maior = p2
        
    for i in range(len(menor)):
        sub = p1[i] - p2[i]
        if sub != 0:
            lista.append(sub)

    for i in range(len(menor), len(maior)):
            lista.append(maior[i] * -1)

    return lista


p1 = [-5, 4, 3]
p2 = [-1, 0, 2, 0, 0, 0, 5]
print(subtrai_polinomios(p1, p2))


'''p1 = [-5, 4, 3]
p2 = [-1, 0, 2, 0, 0, 0, 5]
assert subtrai_polinomios(p1, p2) == [-4, 4, 1, 0, 0, 0, -5]

p1 = [-5, 4, 3]  # 3x2 + 4x - 5
p2 = [-4, 2, 3]  # 3x2 + 2x - 4
assert subtrai_polinomios(p1, p2) == [-1, 2]  # 2x - 1'''
