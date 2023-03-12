def is_substring_expr(str1,str2):
    
    start = ''
    for i in str2:
        if i == '*': break
        start = start + i
         
    end = ''
    for i in range(len(start)+1,len(str2)):
        end = end + str2[i]

    verificator = ''
    for i in str1:
        if verificator == start: break
        verificator = verificator + i

    inversedend = ''
    for i in range(len(end)-1,-1,-1):
        inversedend = inversedend + end[i]

    verificator2 = ''
    for i in range(len(str1)-1, -1, -1):
        if verificator2 == inversedend: break
        verificator2 = verificator2 + str1[i]

    if verificator == start and verificator2 == inversedend:
        return True

    else:
        return False

assert is_substring_expr('oicarovoce','oi*voce')
assert is_substring_expr('oicvoce','oi*voce')
