#include <iostream>

using namespace std;

int main() 
{
    int N;
    long long S = 1;
    cin >> N;
    for( int i = N ; i > 0 ; i-- )
    {
        S *= i;
    }
    cout << S;

    return 0;
}