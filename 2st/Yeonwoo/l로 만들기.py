def solution(myString):
    answer = ''
    ar = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k"]
    for n in myString:
        if n in ar:
            answer += "l"
        else:
            answer += n
    return answer