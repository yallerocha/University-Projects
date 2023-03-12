def tem_afinidade(l1, l2):
    count = 0
    for i in l1:
        for c in l2:
            if c == i:
                count += 1
    
    if count >= 3:
        return True
    else:
        return False

l1 = ['zeze', 'bruno e marrone', 'joao', 'pedro', 'u2']
l2 = ['zeze', 'joao', 'u2', 'jquest']
assert tem_afinidade(l1, l2) == True