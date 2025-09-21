#include <iostream>

using namespace std;

int main()
{
    int n1;
    cin >> n1;
    cout << ( int )( n1 * ( 1 - 0.22 ) ) << " " << ( int )( n1 * ( 1 - 0.2 * 0.22 ) );
    
    return 0;
}