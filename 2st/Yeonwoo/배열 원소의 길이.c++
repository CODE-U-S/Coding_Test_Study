#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<string> strlist) {
    vector<int> answer;
    for(int i=0; i<size(strlist); i++) {
        answer.push_back(strlist[i].length());
    }
    return answer;
}