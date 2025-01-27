#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    for (int i = 2; i <= n; i += 2) {
        answer += i;
    }
    return answer;
}
