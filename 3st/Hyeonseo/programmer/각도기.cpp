#include <string>
#include <vector>

using namespace std;

int solution(int angle) {
    int answer = 1;
    if(angle == 90) {
        answer = 2;
    }
    else if(angle > 90 && angle < 180) {
        answer = 3;
    }
    else if(angle == 180) {
        answer = 4;
    }
    return answer;
}