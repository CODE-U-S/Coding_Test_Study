def solution(arr):
    answer = []
    min_ = min(arr)
    if len(arr) != 1:
        arr.remove(min_)
        answer = arr
    else:
        answer.append(-1)
                
    
    return answer