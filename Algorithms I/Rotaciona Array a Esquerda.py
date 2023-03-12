def rotesq(array):

    if len(array) != 0:
        num = array[0]

    for i in range(len(array)-1):
        array[i] = array[i + 1]
        
    if len(array) != 0:
        array[len(array)-1] = num

    return array

valores = []
assert rotesq(valores) == []