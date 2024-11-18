#include <string>
#include <vector>

using namespace std;

double solution(vector<int> numbers) {
    double answer = 0;
    double sum =0;
    for(int i=0; i<numbers.size(); i++) {
        sum+=numbers[i];
    }
    answer = sum/numbers.size();
    return answer;
}