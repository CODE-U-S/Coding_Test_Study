#include <iostream>
#include <string>
#include <cctype>

using namespace std;

int main()
{
    string str1;
    string str2;
    cin >> str1;
    for (char c : str1)
    {
        str2 += isupper(c) ? tolower(c) : toupper(c);
    }

    cout << str2;
    return 0;
}
