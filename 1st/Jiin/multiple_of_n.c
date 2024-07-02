#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

int solution(int num, int n) {
    if(num%n)
        return 0;
    else
        return 1;
}