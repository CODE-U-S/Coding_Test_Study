def solution(spell, dic):
    for d in dic:
        cnt = 0
        for i in spell:
            if i in d:
                cnt += 1
        if cnt == len(spell):
            return 1
    return 2