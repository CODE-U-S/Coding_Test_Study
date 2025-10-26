#include <iostream>
#include <string>
using namespace std;

int main() {
	int N;
    string s;
    cin >> N;
    for( size_t i = 0 ; i < N ; i++ )
    {
        cin >> s;
        cout << ( s.length() >= 6 && s.length() <= 9 ? "yes" : "no" ) << endl;
    }

    return 0;
}