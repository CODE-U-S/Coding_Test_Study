#include <stdio.h>
#include <stdbool.h>
#include <string.h>
#include <stdlib.h>

// 파라미터로 주어지는 문자열은 const로 주어집니다. 변경하려면 문자열을 복사해서 사용하세요.
char* solution(const char* phone_number) {
    // return 값은 malloc 등 동적 할당을 사용해주세요. 할당 길이는 상황에 맞게 변경해주세요.
    int phone_number_len = strlen(phone_number);
    printf("%d", phone_number_len);
    char* answer = (char*)malloc(phone_number_len + 1);
    
    memset(answer, '*', phone_number_len);
    answer[phone_number_len] = '\0';
    
    for(int i = phone_number_len-1; i > phone_number_len-5; i--)
        answer[i] = phone_number[i];
    
    return answer;
}
