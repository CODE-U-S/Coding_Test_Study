#include <iostream>
#include <vector>

using namespace std;

int main() 
{
    int n1, n3, n4;
    cin >> n1;
    vector<int> n2;
    for( size_t i = 1 ; i <= n1*2 ; i++ )
    {
        if( i % 2 != 0 ) 
        {
            cin >> n3;
            n2.push_back( n3 );
        }
    }
    cin >> n3;
    for( size_t i = 0 ; i < n1 ; i++ )
    {
        if( n2[i] == n3 ) n4++;
    }
    cout << n4;

    return 0;
}