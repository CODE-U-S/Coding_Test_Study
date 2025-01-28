#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
    bool answer = true;
    int cntp = 0;
    int cnty = 0;
    
    for(int i=0; i<s.size(); i++) {
        if(s[i]=='p' or s[i]=='P')
            cntp += 1;
        else if(s[i]=='y' or s[i]=='Y')
            cnty += 1;
    }
    if(cntp!=cnty)
        answer = false;
    return answer;
}