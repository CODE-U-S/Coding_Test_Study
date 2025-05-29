#include <string>
#include <iostream>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    for( auto num : arr ) {
        if( num >= 50 && num%2 == 0 ) {
            answer.push_back(num/2);
        } // if
        else if( num < 50 && num%2 == 1 ) {
            answer.push_back(num*2);
        } // else if
        else {
            answer.push_back(num);
        } // else
    } // for
    return answer;
} // solution