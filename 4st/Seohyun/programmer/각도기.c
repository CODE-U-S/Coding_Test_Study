#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int angle) {
    int answer;
    
    if (angle>0 && angle<90)
        answer=1;
    else if(angle==90)
        answer=2;
    else if(angle>90 && angle<180)
        answer=3;
    else if(angle==180)
        answer=4;
    return answer;
}
