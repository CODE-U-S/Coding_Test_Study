#include <string>
#include <vector>

using namespace std;

string solution(vector<string> arr) {
    string answer = "";
    for(int i=0; i<arr.size(); i++)
        answer+=arr[i];
    return answer;
}