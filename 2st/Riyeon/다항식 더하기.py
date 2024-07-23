def solution(polynomial):
    li = polynomial.split(' + ')
    x, n = 0, 0
    
    for i in li:
        if 'x' in i:
            x += 1 if len(i)==1 else int(i[:-1])
        else:
            n += int(i)
    
    if x == 0 and n == 0:
        return '0'
    elif x == 0:
        return str(n)
    
    if x == 1:
        x = ''
    if n == 0:
        return str(x)+'x'
    else:
        return str(x)+'x + '+str(n)