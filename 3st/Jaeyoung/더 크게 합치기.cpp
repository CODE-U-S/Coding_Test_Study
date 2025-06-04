#include <string>
#include <vector>

using namespace std;

int solution(int a, int b) {
    string answer = "";
    string strA = to_string(a);
    string strB = to_string(b);
    if( strA + strB > strB + strA ) {
        answer = strA + strB;
    } else {
        answer = strB + strA;
    }
    return stoi(answer);
}