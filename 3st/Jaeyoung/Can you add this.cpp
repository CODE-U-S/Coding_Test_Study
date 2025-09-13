#include <iostream>

using namespace std;

int main() 
{
    int n, n1, n2;
    cin >> n;
    for( int i = 0 ; i < n ;  i++ )
    {
        cin >> n1 >> n2;
        cout << ( n1 + n2 ) << endl;
    }
    return 0;
}