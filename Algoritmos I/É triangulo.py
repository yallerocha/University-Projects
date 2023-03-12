a = int(input())
b = int(input())
c = int(input())

if (b - c) < a < (b + c):
    peri = a + b + c
    print(f'triangulo valido. {peri}')

else:
    print('triangulo invalido.')
