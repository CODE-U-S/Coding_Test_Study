#include <iostream>

using namespace std;

int main() 
{
    int n, s;
    while ( cin >> n >> s )
    {
        if( n == 0 && s == 0 ) break;
        cout << ( n > s  ? "Yes" : "No" ) << "\n";
    }
    return 0;
}