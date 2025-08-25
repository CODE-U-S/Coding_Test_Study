#include <iostream>
using namespace std;

int main()
{
    int num1[6];
    int target[6] = {1, 1, 2, 2, 2, 8}; // 체스 말 정답 개수

    for (int i = 0; i < 6; i++)
        cin >> num1[i];

    for (int i = 0; i < 6; i++)
        cout << target[i] - num1[i] << " ";

    return 0;
}
