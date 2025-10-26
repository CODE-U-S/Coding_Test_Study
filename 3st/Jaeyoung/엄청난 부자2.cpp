#include <iostream>
#include <cstring>

using namespace std;

char* max( char*, char* );
void subtract( char*, char* );
void devidesubtract( char*, char*, char*, int );
void devide( char*, char*, char* );

int main()
{
    char a[1001];
    char b[1001];
    char r[1001];
    int ri = 0, ai = 0;
    
    cin >> a >> b;
    devide( a, b, r );

    while ( r[ri] == '0' )
        ri++;
    while( a[ai] == '0' )
        ai++;
    
    if( r[0] == '\0' )
    {
        r[0] = '0';
        r[1] = '\0';
    } // if

    if( a[ai] == '\0' )
        ai--;
    if( r[ri] == '\0' )
        ri--;

    cout << r + ri << endl;
    cout << a + ai << endl;    

    return 0;
} // main

char *max(char *a, char *b)
{
    for (int i = 0; i < strlen(a); i++)
    {
        if (a[i] < b[i])
            return b;
        if (a[i] > b[i])
            return a;
    } // for
    return a;
} // max*

void subtract(char *a, char *b)
{
    for (int i = 0; i < strlen(b); i++)
    {
        a[i] = a[i] - b[i] + '0';
        if (a[i] < '0')
        {
            a[i] += 10;
            a[i - 1]--;
        } // if
    } // for
    for (int i = strlen(b) - 1; i >= 0; i--)
    {
        if (a[i] < '0')
        {
            a[i] += 10;
            a[i - 1]--;
        } // if
    } // for
} // subtract

void devidesubtract( char* a, char* b, char* r, int index )
{
    r[index] = '0';

    while( a[index - 1] > '0' || max(a + index, b) == a + index)
    {
        subtract( a + index, b );
        ++r[index];
    } // while
} // devidesubtract

void devide( char* a, char* b, char* r )
{
    int index = 0;
    int digit = strlen( a ) - strlen( b );

    while( index <= digit )
        devidesubtract( a, b, r, index++ );
    
    r[index] = '\0';
} // deivd