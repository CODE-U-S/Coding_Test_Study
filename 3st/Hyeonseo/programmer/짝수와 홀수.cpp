#include <string>
#include <vector>

using namespace std;

string solution(int num) {
    string answer = "Odd";
    if(num % 2 == 0) {
        answer = "Even";
    }
    return answer;
}