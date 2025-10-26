#include <iostream>

using namespace std;

int main() {
    int n1, n2;

    while ( cin >> n1 >> n2 )
    {
        if( n1 == 0 && n2 == 0 ) break;
        cout << n1 + n2 << '\n';
    }
    
    return 0;
}