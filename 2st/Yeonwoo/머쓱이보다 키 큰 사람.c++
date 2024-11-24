#include <string>
#include <vector>

using namespace std;

int solution(vector<int> array, int height) {
    int answer = 0;
    for(int i=0; i<size(array); i++) {
        if(array[i]>height)
            answer+=1;
    }
    return answer;
}