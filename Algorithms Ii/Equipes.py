jogadores = 0

while True:
    atleta = input()
    if atleta == '-': break
    jogadores += 1

if jogadores == 5:
    print('Modalidade -> Basquete')
elif jogadores == 11:
    print('Modalidade -> Futebol')
elif jogadores == 6:
    print('Modalidade -> Vôlei')
elif jogadores == 7:
    print('Modalidade -> Handebol')
else:
    print('Equipe Inválida')
    
    
