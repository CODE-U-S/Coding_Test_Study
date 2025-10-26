def solution(arr, delete_list):
    answer = arr
    for i in range (len(delete_list)) :
        if (delete_list[i] in arr) :
            arr.remove(delete_list[i])
    return answer