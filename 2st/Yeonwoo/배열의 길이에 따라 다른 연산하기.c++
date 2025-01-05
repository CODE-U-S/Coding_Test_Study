#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, int n) {
    vector<int> answer;
    if(arr.size()%2==0) {
        for(int i=0; i<arr.size(); i++){
            if(i%2==1)
                answer.push_back(arr[i]+n);
            else
                answer.push_back(arr[i]);
        }
    }
    else {
        for(int i=0; i<arr.size(); i++){
            if(i%2==0)
                answer.push_back(arr[i]+n);
            else
                answer.push_back(arr[i]);
        }
    }
    return answer;
}