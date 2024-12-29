#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    int s = num_list.size();
    if(s>=11){
        for(int i=0; i<s; i++) {
            answer+=num_list[i];
        }
    }
    else if(s<=10) {
        answer = 1;
        for(int i=0; i<s; i++) {
            answer*=num_list[i];
        }
    }
    return answer;
}