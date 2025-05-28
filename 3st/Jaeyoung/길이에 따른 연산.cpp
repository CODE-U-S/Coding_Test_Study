#include <string>
#include <vector>

using namespace std;

int solution(vector<int> num_list) {
    int answer = 0;
    int s = 0;
    int m = 1;
    for( auto x : num_list ) {
        if( num_list.size() >= 11 ) {
            s += x;
            answer = s;
        } // if
        else {
            m *= x;
            answer = m;
        } // else
    } // for
    
    return answer;
}