# Curso: Ciência da Computação D - UFCG
# Disciplina: Programação I & Laboratório de Programação I
# Aluno: Yalle Rocha Silva | Matrícula: 121110387 | Data: 24/03/2022 
# Linguagem: Python 3.9.7
# Objetivo: mandar os itens divisíveis por k para a direita da lista, mantendo a ordem original

def aparta(nums, k):
    cont = 0
    quant = 0

    for i in range(len(nums)-1,-1,-1):  
        for j in range(len(nums)-1-cont,-1,-1):
            if nums[j] % k == 0:
                temp = nums[j]
                nums[j] = nums[i]
                 
                for c in range(j,len(nums)-1-cont):
                    nums[c] = nums[c+1]

                nums[i] = temp
                quant += 1
                break
        cont += 1
                                     
    return quant

v = [8, 10, 11, 7, 21, 2, 17, 6, 28, 24]
assert aparta(v, 3) == 3
assert v == [8, 10, 11, 7, 2, 17, 28, 21, 6, 24]
