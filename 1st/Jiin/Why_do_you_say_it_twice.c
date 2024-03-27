#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// arr_len은 배열 arr의 길이입니다.
int* solution(int arr[], size_t arr_len) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    
    int first = -1, last = -1, i = 0;
    for(i =0; i < arr_len; i++){
        if(arr[i] == 2){
            first = i;
            break;
        }
    }
    for(i = first; i < arr_len; i++){
        if(arr[i] == 2)
            last = i;
    }
    
    int* answer = (int*)malloc(sizeof(int)*((last+1) - first));
    
    if(first != -1){
        for(i = 0; i < last + 1 - first; i++)
            answer[i] = arr[first+i];
    }else{
        answer[0] = -1;
    }
    return answer;
}
