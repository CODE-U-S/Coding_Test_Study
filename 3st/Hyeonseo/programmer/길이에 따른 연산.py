def solution(num_list):
    if len(num_list) >= 11:  # 리스트 길이가 11 이상이면
        return sum(num_list)
    else:  # 리스트 길이가 10 이하이면
        product = 1
        for num in num_list:
            product *= num
        return product
