def solution(names):
    answer = []
    for i, name in enumerate(names):
        if i%5==0:
            answer.append(name)
    return answer