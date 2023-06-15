#include <stdio.h>

int main()
{
	int a = -1, b = -1;
	int sum = 0, max = 0;
	for (int i = 0; i < 4; i++)
	{
		scanf("%d %d", &a, &b);
		sum = sum - a + b;
		if (max < sum)
			max = sum;
	}
	printf("%d\n", max);
	return 0;
}