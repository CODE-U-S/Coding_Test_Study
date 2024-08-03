def solution(binomial):
    answer = 0
    #a = 0
    #b = 0
    #op = ''
    a,op,b = binomial.split()
    if op == '+':
        answer = int(a)+int(b)
    elif op == '-':
        answer = int(a)-int(b)
    elif op == '*':
        answer = int(a)*int(b)        
    return answer