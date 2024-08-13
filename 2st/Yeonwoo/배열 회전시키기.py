def solution(numbers, direction):
    answer = []
    if direction == "right":
        for i, num in enumerate(numbers):
            if i==len(numbers)-1:
                answer.insert(0,num)
            else:
                answer.insert(i+1, num)
    else:
        for i, num in enumerate(numbers):
            answer.insert(i-1,num)
    return answer