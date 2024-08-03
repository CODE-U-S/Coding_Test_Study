def solution(num_list):
    answer = 0
    even = ''
    odd = ''
    for i in num_list:
        if i%2==1:
            odd += str(i)
        elif i%2==0:
            even += str(i)
    answer = int(even) + int(odd)
    return answer