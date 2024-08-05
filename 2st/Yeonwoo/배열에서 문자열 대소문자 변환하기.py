def solution(strArr):
    answer = []
    for i, str_ in enumerate(strArr):
        if i%2==1:
            answer.append(str_.upper())
        else:
            answer.append(str_.lower())
    return answer