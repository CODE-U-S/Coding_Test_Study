#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> num_list) {
        vector<int> answer(num_list.size());
        for (int i = 0; i < num_list.size(); i++) {
            answer[i] = num_list[num_list.size() - i - 1];
        }
        return answer;
    }