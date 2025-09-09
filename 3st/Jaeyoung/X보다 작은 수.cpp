#include <iostream>
#include <vector>

using namespace std;

int main() 
{
    int n1, n3, n4;
    cin >> n1 >> n3;
    vector<int> n2;
    for( size_t i = 1 ; i <= n1*2 ; i++ )
    {
        if( i % 2 != 0 ) 
        {
            cin >> n4;
            if( n4 < n3 )
                n2.push_back( n4 );
        }
    }
    for( size_t i = 0 ; i < size( n2 ) ; i++ )
    {
        cout << n2[i] << " ";
    }

    return 0;
}