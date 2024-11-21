#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer;
    int even = 0;
    int odd = 0;
    for(int i=0; i<size(num_list); i++){
        if(num_list[i]%2==0)
            even++;
        else
            odd++;
    }
    answer.push_back(even);
    answer.push_back(odd);
    return answer;
}