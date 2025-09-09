#include <iostream>

using namespace std;

int main() {
    string A;
    cin >> A;
    for( size_t i = 1 ; i <= 9 ; i++ )
    {
        if( i == 5 ) cout << ":" << A << ":";
        else cout << ":fan:";
        if( i % 3 == 0 ) cout << endl;
    }
    return 0;
}