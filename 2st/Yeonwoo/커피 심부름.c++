#include <string>
#include <vector>

using namespace std;

int solution(vector<string> order) {
    int answer = 0;
    
    for(int i = 0; i < order.size(); ++i) {
        if(order[i].find("americano") != string::npos || order[i].find("anything") != string::npos) answer += 4500;
        else if(order[i].find("cafelatte") != string::npos) answer += 5000;
    }
    return answer;
}