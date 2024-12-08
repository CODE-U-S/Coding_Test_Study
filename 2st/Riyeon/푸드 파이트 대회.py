def solution(food):
    answer = ''
    for i in range(1, len(food)):
        for j in range(food[i]//2):
            answer += str(i)
    li = list(answer)
    li.reverse()
    answer += str(0) + ''.join(li)
    return answer