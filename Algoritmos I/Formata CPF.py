cpf1 = int(input())
cpf2 = int(input())
cpf3 = int(input())

form1 = int(cpf1 // 100)
resto1 = cpf1 - (form1 * 100)
soma1 = int(resto1 / 10) + int(resto1 - (int(resto1 / 10)) * 10)

form2 = int(cpf2 // 100)
resto2 = cpf2- (form2 * 100)
soma2 = int(resto2 / 10) + int(resto2 - (int(resto2 / 10)) * 10)

form3 = int(cpf3 // 100)
resto3 = cpf3 - (form3 * 100)
soma3 = int(resto3 / 10) + int(resto3 - (int(resto3 / 10)) * 10)

print(f'{form1}-{resto1}\n{soma1}')
print(f'{form2}-{resto2}\n{soma2}')
print(f'{form3}-{resto3}\n{soma3}')
