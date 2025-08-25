#include <iostream>

using namespace std;

int main() 
{
    int n, s;
    while ( cin >> n >> s ) 
    {
        cout << s / ( n + 1 ) << "\n";
    }
    return 0;
}