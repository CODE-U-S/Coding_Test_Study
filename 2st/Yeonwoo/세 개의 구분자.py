def solution(myStr):
    answer = myStr.replace('a',' ').replace('b',' ').replace('c',' ')
    return answer.split() or ["EMPTY"]
