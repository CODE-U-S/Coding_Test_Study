#include <iostream>

using namespace std;

int main() {
    int n1, n2, n3;

    cin >> n1;
    for( size_t i = 0 ; i < n1 ; i++ )
    {
        cin >> n2 >> n3;
        cout << "Case #" << i+1 << ": " << n2 + n3 << endl;
    }

    return 0;
}