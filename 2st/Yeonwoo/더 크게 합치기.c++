#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    int answer = 0;
    string su1 = "";
    string su2 = "";
    su1 = to_string(a) + to_string(b);
    su2 = to_string(b) + to_string(a);
    if(stoi(su1)>stoi(su2))
        answer = stoi(su1);
    else if(stoi(su1)<stoi(su2))
        answer = stoi(su2);
    else
        answer = stoi(su1);
    return answer;
}