contador = 0

while True:
    contador += 1
    consoantes = 0
    vogais = 0
    palavra = input().upper()

    for i in palavra:
        if i in 'AEIOU':
            vogais += 1
            
        else:
            consoantes += 1

    if consoantes > vogais: break

print(contador)
