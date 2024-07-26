def solution(A, B):
    answer = 0
    li = list(A)
    for i in range(len(A)):
        if ''.join(li) != B :
            answer += 1
            li.insert(0, li[-1])
            li.pop(-1)
        else:
            break;
    if answer == len(A):
        answer = -1
    return answer