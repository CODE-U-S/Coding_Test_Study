#include<stdio.h>

int main() {
	int com[101] = { 0 };
	int people, number, count = 0;
	scanf("%d", &people);
	for (int i = 1; i <= people; i++) 
	{
		scanf("%d", &number);
		if (com[number] == 0) {
			com[number] = 1;
		} else {
			count++;
		}
	}
	printf("%d", count);
	return 0;
}
