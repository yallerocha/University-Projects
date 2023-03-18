bin = input() 
soma = 0
inverso = ''

for i in range(len(bin)-1,-1,-1):
    inverso += bin[i]

for i in range(len(inverso)-1,-1,-1):      
   num = int(inverso[i]) * 2 ** i
   soma += num
   print(f'{int(inverso[i])} * {2**i} = {num}')

print(f'{bin}(2) = {soma}(10)')