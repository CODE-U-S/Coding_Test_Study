#include <iostream>

using namespace std;

int main()
{
    int T, S;

    cin >> T >> S;
    int A = 280;
    if( T >= 12 && T <= 16 && S == 0 )
        A = 320;

    cout << A;
    return 0;
}
