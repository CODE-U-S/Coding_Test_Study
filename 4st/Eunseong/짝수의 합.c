#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int n) {
    int answer = 0;
    for (int i = 1; i <= n; i++) {
        if (i % 2 == 0) {
        answer = answer + i;
        }
    }
    return answer;
}