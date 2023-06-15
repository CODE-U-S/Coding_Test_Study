#include <stdio.h>

int changeCup();

main() {
    printf("%d\n", changeCup());
}

int changeCup() {
    int cup[3] = { 1, 2, 3 };
    int m;
    scanf("%d", &m);
    for (int i = 0; i < m; i++)
    {
        int a, b, tmp;
        scanf("%d %d", &a, &b);
        tmp = cup[a - 1];
        cup[a - 1] = cup[b - 1];
        cup[b - 1] = tmp;
        if ((a < 1 || a > 3) || (b < 1 || b > 3))
            return -1;
    }
    for(int i = 0; i < 3; i++)
        if(cup[i] == 1)
            return i + 1;

}