#include <string>
#include <vector>
#include <math.h>

using namespace std;
int solution(int n) {
    int answer = 0;
    int a = sqrt(n);
    if(sqrt(n) == a)
        answer = 1;
    else
        answer = 2;
    return answer;
}