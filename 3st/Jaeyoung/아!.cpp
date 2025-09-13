#include <iostream>

using namespace std;

int main() 
{
    string n, s;
    cin >> n >> s;
    cout << ( n.length() >= s.length() ? "go" : "no" ) << "\n";
    return 0;
}