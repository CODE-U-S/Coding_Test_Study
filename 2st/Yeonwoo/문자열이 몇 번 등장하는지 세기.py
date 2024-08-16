def solution(myString, pat):
    answer = 0
    pat_len = len(pat)
    for i in range(len(myString)-pat_len+1):
        if myString[i:i+pat_len]==pat:
            answer+=1
    return answer