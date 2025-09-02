#include <iostream>
#include <string>
using namespace std;

int main() {
    string word;
    cin >> word;

    cout << string(word.rbegin(), word.rend()) << endl;

    return 0;
}
