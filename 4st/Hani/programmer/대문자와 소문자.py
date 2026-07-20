def solution(my_string):
    answer = ''
    
    for i in range(len(my_string)) :
        if(my_string[i].isupper()) :
            answer += my_string[i].lower()
        elif(my_string[i].islower()) :
            answer += my_string[i].upper()
    return answer