#include <iostream>

using namespace std;

int main() {
    int R, C;
    cin >> R >> C;
    for( size_t i = 0 ; i < R ; i++ )
    {
        for( size_t j = 0 ; j < C ; j++ )
            cout << "*";
        cout << endl;
    }
    return 0;
}