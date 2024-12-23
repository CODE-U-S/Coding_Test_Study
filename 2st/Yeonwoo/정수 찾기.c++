#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list, int n) {
    int answer = 0;
    for(int i=0; i<num_list.size(); i++) {
        if(num_list[i]==n){
            answer=1;
            break;
        }
    }
    return answer;
}