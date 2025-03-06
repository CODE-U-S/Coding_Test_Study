#include <string>
#include <vector>
#include <cmath>

using namespace std;

int solution(int n) {
     int answer = 2;
        if (std::sqrt(n) == (int)std::sqrt(n)) {
            answer = 1;
        }
    return answer;
}