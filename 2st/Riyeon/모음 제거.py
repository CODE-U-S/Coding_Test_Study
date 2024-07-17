def solution(my_string):
    a = 'aeiou'
    for i in a:
        my_string = my_string.replace(i, '');
    return my_string