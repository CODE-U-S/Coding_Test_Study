def solution(array, commands):
    answer = []
    for i, j, k in commands:
        li = array[i-1:j]
        li.sort()
        answer.append(li[k-1])
    return answer