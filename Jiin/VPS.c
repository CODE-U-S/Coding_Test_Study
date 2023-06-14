#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>

int main() {
    char str[51] = {'\0',};
    int howMany;
    scanf("%d", &howMany);
    int* result = (int*)malloc(howMany*sizeof(int));
    for (int i = 0; i < howMany; i++) {
        result[i] = 0;
        scanf("%s", &str);
        int j = -1;
        while(str[++j] != '\0') {
            if (result[i] == 0 && str[j] == ')') {
                result[i] = 1;
                break;
            }
            if (str[j] == '(') result[i]++;
            else if (str[j] == ')') result[i]--;
        }
    }

    for (int k = 0; k < howMany; k++) {
        if (result[k]) printf("NO\n");
        else printf("YES\n");
    }
    free(result);
}