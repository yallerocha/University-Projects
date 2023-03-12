maioreslist = []
media = float(input())

while True:
    seq = input()
    if seq == 'fim': break
    numbers = seq.split()

    count = 0
    soma = 0

    while True:
        if count == len(numbers): break
        soma += int(numbers[count])
        media2 = soma / len(numbers)
        if media2 > media and count == len(numbers) - 1:
            maioreslist.append(seq)

        count += 1

    if media2 <= (media / 2): break

count = 0

while True:
    if count == len(maioreslist): break
    print(maioreslist[count])

    count += 1
