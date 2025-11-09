#include <iostream>

using namespace std;

int main()
{
    string S;
    int I;

    cin >> S;
    cin >> I;

    for( size_t i = 0 ; i < S.length() ; i++ )
        if ( i == I-1 )
            cout << S[i];

    return 0;
}
