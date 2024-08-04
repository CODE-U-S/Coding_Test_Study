def solution(todo_list, finished):
    answer = []
    temp = []
    for i, tf in enumerate(finished):
        if tf==0:
            temp.append(i)
    for i in temp:
        answer.append(todo_list[i])
    return answer