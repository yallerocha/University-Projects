def is_substring(str1, str2):
    comparar, start = '', 0
    for i in str2:
        for c in range(start, len(str1)):
            if i == str1[c]:
                comparar = comparar + (str1[c])
                if comparar == str2: return True
                start = c + 1
                break
            else:
                comparar = ''
    return False

assert is_substring('boiada','oi')
assert not is_substring('casorio', 'casa')
