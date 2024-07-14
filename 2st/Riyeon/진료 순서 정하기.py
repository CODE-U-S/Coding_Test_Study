def solution(emergency):
    answer = []
    emre = sorted(emergency, reverse=True)
    for i in emergency:
        answer.append(emre.index(i)+1)
    return answer