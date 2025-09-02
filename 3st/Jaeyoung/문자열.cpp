#include <iostream>
#include <string>

using namespace std;

int main()
{

    int n;
    string s;
    cin >> n;
    for( size_t i = 0 ; i < n ; i++ )
    {
        cin >> s;
        cout << s[0] << s[s.length() - 1] << endl;
    }

    return 0;
}