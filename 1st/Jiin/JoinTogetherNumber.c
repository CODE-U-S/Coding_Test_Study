#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int odd = 0;
    int even = 0;
    
    for(int i = 0; i < num_list_len; i++){
        if(num_list[i]%2 == 1){
            odd *= 10;
            odd += num_list[i];
        }else{
            even *= 10;
            even += num_list[i];
        }
    }
    
    return odd + even;
}
