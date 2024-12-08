def solution(num_list):
    o = 0
    e = 0
    for i in range(len(num_list)):
        if i % 2 == 0:
            e += num_list[i]
        else:
            o += num_list[i]
    return o if o > e else e