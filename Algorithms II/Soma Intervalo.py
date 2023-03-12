def soma_intervalo(a,b):
   
    if a == b:
        return a

    elif a != b:  
        soma = 0 
        for num in range(a,b+1):
            soma += num
        return soma

print(soma_intervalo(1,143))
print(soma_intervalo(10,10))