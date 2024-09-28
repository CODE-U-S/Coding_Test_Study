def solution(s):
    li = list(map(int,s.split(" ")))
    answer = str(min(li)) + " " + str(max(li))
    return answer