def solution(my_string):
    answer = ''
    
    new = my_string.lower()
    
    new = sorted(new)
    answer = "".join(new)
    return answer