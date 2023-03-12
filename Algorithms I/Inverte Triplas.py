def inverte3a3(s):

    quantidade = len(s) / 3
    grupos, start, end = [], 0, 3

    while True:
        if len(grupos) == quantidade:break
        grupo = ''
        for i in range(start, end):
            grupo = grupo + s[i]

        grupos.append(grupo)
        start = end
        end = end + 3

    triploinvertido = ''
    for i in range(len(grupos)-1, -1, -1):
        triploinvertido = triploinvertido + grupos[i]

    return triploinvertido

assert inverte3a3('abcdefghijkl') == 'jklghidefabc'
assert inverte3a3("abcdef") == "defabc"
