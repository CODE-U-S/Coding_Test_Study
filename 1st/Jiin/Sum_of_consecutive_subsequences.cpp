#include <string>
#include <vector>
#include <iostream>

using namespace std;

vector<int> solution(vector<int> sequence, int k) {
    vector<int> answer(2);
    int start = 0, end = 0;
    int sum = 0;
    int len = 1000001;
    
    for(int start = 0; start < sequence.size(); start++){
        while(sum < k && end < sequence.size()){
            sum += sequence[end];
            end += 1;
        }
        
        if(sum == k && len > end - start){
            len = end - start;
            answer[0] = start;
            answer[1] = end - 1;
        }
        sum -= sequence[start];
    }
    
    return answer;
}
