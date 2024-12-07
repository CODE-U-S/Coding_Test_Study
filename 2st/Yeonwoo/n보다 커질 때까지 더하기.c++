#include <string>
#include <vector>

using namespace std;

int solution(vector<int> numbers, int n) {
    int answer = 0;
        for(int i=0; i<numbers.size(); i++){
            answer+=numbers[i];
            if(answer>n)
                break;
        }
    return answer;
}