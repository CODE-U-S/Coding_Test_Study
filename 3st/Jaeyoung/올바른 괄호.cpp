#include<string>
#include <iostream>
#include <vector>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    vector<int> num;

    for( auto x : s ) {
        if( x == '(' ) {
            num.push_back(x);
        } else {
            if( size( num ) == 0 ) {
                return false;
            }
            num.pop_back();
        }
    }
    
    if( size( num ) == 0 ) {
        return true;
    }

    return false;
}