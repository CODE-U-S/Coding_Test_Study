#include <string>
#include <vector>

using namespace std;

string solution(string phone_number) {
    string answer = "";
    int n = phone_number.length();
    
    for (int i = 0; i < n; i++) {
        if (i < n - 4) {
            answer += "*";
        } else {
            answer += phone_number[i];
        }
    }
    
    return answer;
}
