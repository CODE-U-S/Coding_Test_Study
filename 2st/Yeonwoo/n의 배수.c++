#include <string>
#include <vector>

using namespace std;

int solution(int num, int n) {
    int answer = 0;
    if(num%n==0)
        answer = 1;
    return answer;
}