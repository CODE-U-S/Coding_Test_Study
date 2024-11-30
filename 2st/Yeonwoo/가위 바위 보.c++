#include <string>
#include <vector>

using namespace std;

string solution(string rsp) {
    string answer = "";
    for(int i=0; i<size(rsp); i++) {
        if(rsp[i]=='2')
            answer+='0';
        else if(rsp[i]=='0')
            answer+='5';
        else
            answer+='2';
    }
    return answer;
}