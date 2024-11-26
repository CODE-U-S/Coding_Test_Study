#include <string>
#include <vector>

using namespace std;

vector<int> solution(int n, vector<int> numlist) {
    vector<int> answer;
    for(int i=0; i<size(numlist); i++) {
        if(numlist[i]%n==0)
            answer.push_back(numlist[i]);
    }
    return answer;
}