def solution(myString):
    result = ''
    for ch in myString:
        if ch < 'l':
            result += 'l'
        else:
            result += ch
    return result
