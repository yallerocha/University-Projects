# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 21/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: receber uma linha de código e aplicar três regras definidas, visando "ofuscar" o código para tornar a sua leitura mais complexa.

# QUESTÃO NÃO FINALIZADA

def ofuscador(linha):

    linha2 = ''
    linha3 = ''
    linhafinal = ''

    for caractere in linha:
        if 65 <= ord(caractere) <= 90:
            linha2 = linha2 + chr(ord(caractere) + 32)
        elif 97 <= ord(caractere) <= 122:
            linha2 = linha2 + chr(ord(caractere) - 32)
        else:
            linha2 = linha2 + caractere

    for caractere in linha2:
        if caractere == 'A' or caractere == 'a':
            linha3 = linha3 + '4'
        elif caractere == 'B' or caractere == 'b':
            linha3 = linha3 + '8'
        elif caractere == 'E' or caractere == 'e':
            linha3 = linha3 + '3'
        elif caractere == 'G' or caractere == 'g':
            linha3 = linha3 + '6'
        elif caractere == 'I' or caractere == 'i':
            linha3 = linha3 + '1'
        elif caractere == 'L' or caractere == 'l':
            linha3 = linha3 + '7'
        elif caractere == 'S' or caractere == 's':
            linha3 = linha3 + '5'
        elif caractere == 'O' or caractere == 'o':
            linha3 = linha3 + '0'
        else:
            linha3 = linha3 + caractere

    for caractere in linha3:
        if ord(caractere) == 32:
            linhafinal = linhafinal + "*"
        # PARTE NÃO FINALIZADA

        else:
            linhafinal = linhafinal + caractere

    return linhafinal

