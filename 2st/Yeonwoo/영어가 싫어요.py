def solution(numbers):
    answer = 0
    integer_list = ["zero","one", "two", "three", "four", "five", "six", "seven","eight", "nine"]
    for i, num in enumerate(integer_list):
        numbers = numbers.replace(num,str(i))
    answer= int(numbers)
    return answer