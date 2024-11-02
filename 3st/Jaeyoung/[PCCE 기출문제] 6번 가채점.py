def solution(numbers, our_score, score_list):
    answer = []
    for i in range(len(numbers)):
        if score_list[numbers[i] - 1] == our_score[i]:
            answer.append("Same")
        else:
            answer.append("Different")
    
    return answer