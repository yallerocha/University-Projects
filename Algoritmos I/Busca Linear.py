def retorna_index(seq, valor):
    for i in range(len(seq)):
        if seq[i] == valor:
            return i
    return -1

seq = [8, 9, 2, 3, 6, 10, 7, 9]
assert retorna_index(seq, 6) == 4
assert retorna_index(seq, 4) == -1
assert retorna_index(seq, 9) == 1