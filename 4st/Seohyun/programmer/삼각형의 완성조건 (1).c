#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// sides_len은 배열 sides의 길이입니다.
int solution(int sides[], size_t sides_len) {
    int temp=0;
    int answer=0;
    for(int i=0; i<3; i++) {
        for (int j=1; j<3; j++) {
            if(sides[i]<sides[j]) {
                temp=sides[i];
                sides[i]=sides[j];
                sides[j]=temp;
            }
        }
    }
    if(sides[0]>=sides[1]+sides[2])
        answer=2;
    else if(sides[0]<sides[1]+sides[2])
        answer=1;
    return answer;
}