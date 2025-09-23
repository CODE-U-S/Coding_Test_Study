#include <iostream>
#include <cmath>

using namespace std;

int main() {
    int t;
    cin >> t;
    for( size_t i = 0 ; i < t ; i++ )
    {
        int a, b, result = 1;
        cin >> a >> b;
        for( size_t j = 0 ; j < b ; j++ )
            result = ( result * a ) % 10;
        if( result == 0 ) cout << 10 << endl;
        else cout << result << endl;
    } // for
    
    return 0;
}