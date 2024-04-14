function solution(my_string, overwrite_string, s) {
    return my_string.slice(0,s) + overwrite_string + my_string.slice(overwrite_string.length+s);
}
