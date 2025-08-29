def solution(hp):
    generals = hp // 5         
    remainder = hp % 5         
    soldiers = remainder // 3   
    ants = remainder % 3       
    return generals + soldiers + ants