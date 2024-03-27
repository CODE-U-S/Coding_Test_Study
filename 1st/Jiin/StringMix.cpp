#include <string>
#include <vector>

using namespace std;

string solution(string str1, string str2) {
    string answer = "";
    for(int i = 0; i < str1.size(); i++){
        answer += str1.substr(i, 1) + str2.substr(i, 1);
    }
        
    return answer;
}
