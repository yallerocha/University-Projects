# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 21/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: ler uma lista de receitas, uma de despesas e imprimir o lucro mensal da empresa. 


from unicodedata import decimal

meses = ['jan', 'fev', 'mar', 'abr', 'mai', 'jun', 'jul', 'ago', 'set', 'out', 'nov', 'dez']
lucros = []

for mes in meses:
    receitaedespesa = input().split()
    receita = decimal(receitaedespesa[0])
    despesa = decimal(receitaedespesa[1])
    lucros.append(receita - despesa)

for i in range(len(meses)):
    print(f'{meses[i]} {lucros[i]}')
