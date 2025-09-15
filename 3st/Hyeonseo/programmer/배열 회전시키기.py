def solution(numbers, direction):
    if direction == "right":
        return [numbers[-1]] + numbers[:-1]  # 마지막 원소 앞으로
    else:  # direction == "left"
        return numbers[1:] + [numbers[0]]    # 첫 원소 뒤로
