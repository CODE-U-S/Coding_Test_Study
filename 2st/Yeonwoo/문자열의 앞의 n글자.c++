#include <string>
#include <vector>

using namespace std;

string solution(string my_string, int n) {
    string answer = "";
    for(int i=0; i<n; i++)
        answer+=my_string[i];
    return answer;
}