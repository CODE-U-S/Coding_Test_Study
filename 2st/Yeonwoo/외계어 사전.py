def solution(spell, dic):
    answer = 2
    temp = []
    for i in dic:
        if len(i) == len(spell):
            cnt = 0
            for j in spell:
                if j in i:
                    cnt+=1
                if len(spell) == cnt:
                    answer = 1
                    break
                else:
                    answer = 2
    return answer