import sys
import os

filename = "dados.dat"
if not os.path.exists(filename):
    print("O arquivo de dados (dados.dat) não existe")
    print("Execute: python3 gendata.py pra gerar o arquivo")
    sys.exit(1)

arq = open(filename)

linha = 0

while True:
    num = int(arq.readline())
    linha += 1
    if num < 100:
        print(f'{num}, na posição {linha}')
        break