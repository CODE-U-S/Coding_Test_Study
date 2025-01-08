#include <iostream>

using namespace std;

int main(void) {
    int n;
    cin >> n;
    if(n%2==0)
        cout << to_string(n) << " is even";
    else
        cout << to_string(n) << " is odd";
    return 0;
}