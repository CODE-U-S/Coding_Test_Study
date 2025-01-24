#include <string>
#include <vector>

using namespace std;

double solution(vector<int> numbers) {
    double answer = 0;
    int length = numbers.size();

    for (int i = 0; i < length; i++) {
        answer = answer + numbers[i];
    }
    
    return answer / length;
}
