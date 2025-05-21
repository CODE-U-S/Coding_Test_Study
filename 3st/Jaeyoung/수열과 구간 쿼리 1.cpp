#include <string>
#include <vector>

using namespace std;

vector<int> solution(vector<int> arr, vector<vector<int>> queries) {
    for( auto& p : queries ) 
        for( int i = p[0] ; i < p[1] + 1 ; i++ ) 
            arr[i] += 1;
    return arr;
}