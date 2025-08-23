#include <iostream>

using namespace std;

int main()
{
    int n1, n2, n3, n4, n5;
    int sum;
    cin >> n1 >> n2 >> n3 >> n4 >> n5;
    sum = ( n1 * n1 ) + ( n2 * n2 ) + ( n3 * n3 ) + ( n4 * n4 ) + ( n5 * n5 );
    cout << sum%10;
    
    return 0;
}