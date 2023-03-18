count = 0
fator = int(input())
while True:
    if count == 11: break
    produto = count * fator
    print(f'{fator}  x {count:2}  = {produto:3}')
    count += 1