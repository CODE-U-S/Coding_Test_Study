#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int sum = 0;
    int total_multiple = 1;
    
    for(int i = 0; i < num_list_len; i++){
        sum += num_list[i];
        total_multiple *= num_list[i];
    }
    
    return total_multiple < sum*sum ? 1 : 0;
}
