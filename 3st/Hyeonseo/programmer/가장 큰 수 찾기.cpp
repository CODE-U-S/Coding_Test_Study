#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> array) {
    vector<int> answer(2); // answer 크기 2로 초기화
    int max = array[0];    // 초기 최대값 설정
    int index = 0;         // 최대값의 인덱스 초기화
    
    for (int i = 1; i < array.size(); i++) {
        if (array[i] > max) {
            max = array[i];
            index = i;     // 최대값이 갱신되면 인덱스도 갱신
        }
    }
    
    answer[0] = max;       // 최대값 저장
    answer[1] = index;     // 최대값의 인덱스 저장
    return answer;
}
