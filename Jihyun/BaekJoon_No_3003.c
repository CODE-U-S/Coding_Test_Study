#include <stdio.h>
#define SIZE 6

int main()
{
	int chess[SIZE] = {1, 1, 2, 2, 2, 8};
	int inp_chess[SIZE];

	for (int i = 0; i < SIZE; i++) {
		scanf("%d", &inp_chess[i]);
	}

	for (int i = 0; i < SIZE; i++)
		printf("%d ", chess[i] - inp_chess[i]);
	printf("\n");
	
	return 0;
}