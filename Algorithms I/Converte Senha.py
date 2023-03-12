senha = input()

trocas = 0

for i in range(len(senha)):

    if i != 0:

        if senha[i] in 'Aa':
            cripto = cripto + '4'
            trocas += 1

        elif senha[i] in 'Ee':
            cripto = cripto + '3'
            trocas += 1

        elif senha[i] in 'Ii':
            cripto = cripto + '1'
            trocas += 1   

        elif senha[i] in 'Oo':
            cripto = cripto + '0'
            trocas += 1

        else:
            cripto = cripto + senha[i]
            
    else:
        cripto = senha[0]

print(f"{cripto} ({trocas} troca(s))")
