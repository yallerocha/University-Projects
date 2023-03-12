# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 20/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: ler três palavras referêntes ao nome de um novo "ordenopolitano" e imprimir o nome completo dele.  

alphabet = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']

for i in range(len(alphabet)):
    alphabet[i] = i

while True:

    firstname = input('nome 1? ').lower()
    secondname = input('nome 2? ').lower()
    thirdname = input('nome 3? ').lower()

    if firstname[0] < secondname[0] < thirdname[0]:
        fullname = f'{firstname} {secondname} de {thirdname}'
        print(fullname)
        break

    else:
        print('nomes inválidos: tente novamente')
