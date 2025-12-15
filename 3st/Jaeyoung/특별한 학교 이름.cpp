#include <iostream>

using namespace std;

int main() 
{
    string school;
    cin >> school;
    cout << ( school.compare("NLCL") == 0 ? "North London Collegiate School"
           : ( school.compare("BHA") == 0 ? "Branksome Hall Asia"
           : ( school.compare("KIS") == 0 ? "Korea International School"
           : "St. Johnsbury Academy" ) ) );

    return 0;
}