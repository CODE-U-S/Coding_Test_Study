#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
    vector<int> answer = num_list;
    int size = num_list.size();
    answer.push_back(num_list[size-1] > num_list[size-2]
                     ? num_list[size-1] - num_list[size-2]
                     : num_list[size-1]*2);
    return answer;
}