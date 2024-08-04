def solution(num_list):
    answer = 0
    even = 0
    odd = 0
    for i, num in enumerate(num_list):
        if i%2==0:
            even += num
        elif i%2==1:
            odd += num
    answer = max(even, odd)
    return answer