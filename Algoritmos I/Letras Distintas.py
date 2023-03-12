letrasiguais = []

primeirapalavra = input()
segundapalavra = input()

for i in primeirapalavra:
    for c in segundapalavra:    
        if i == c:
            letrasiguais.append(i)
            break
            
resultado = len(primeirapalavra) - len(letrasiguais)

print(resultado)
