reprovados = 0

while True:
    contador, faltas = 0, 0
    presenca = input()
    if presenca == '-': break
    
    while True:
        if contador == len(presenca): break
        if presenca[contador] == 'f':
            faltas += 1
        contador += 1 
        
    if faltas > 8:
        reprovados += 1

print(f'{reprovados} aluno(s) reprovado(s) por falta.')
