#include <string>
#include <vector>

using namespace std;

int solution(int n, int t) {
    for( int i = 0 ; i < t ; i++ ) {
        n *= 2;
    }
    return n;
}