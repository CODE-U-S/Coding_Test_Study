def solution(quiz):
    answer = []
    temp = 0
    for i in quiz:
        a, op, b, ev, c = i.split()
        if op == '+':
            temp = int(a)+int(b)
            if temp == int(c):
                answer.append('O')
            else:
                answer.append('X')
        else:
            temp = int(a)-int(b)
            if temp == int(c):
                answer.append('O')
            else:
                answer.append('X')
                
        
    return answer