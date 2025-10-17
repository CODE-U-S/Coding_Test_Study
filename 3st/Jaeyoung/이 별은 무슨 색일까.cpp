#include <iostream>

using namespace std;

int main()
{
    int A;
    string str;

    cin >> A;
    if( A >= 380 )
    {
        str = "Violet";
        if( A >= 425 )
        {
            str = "Indigo";
            if( A >= 450 )
            {
                str = "Blue";
                if( A >= 495 )
                {
                    str = "Green";
                    if( A >= 570 )
                    {
                        str = "Yellow";
                        if( A >= 590 )
                        {
                            str = "Orange";
                            if( A >= 620 )
                                str = "Red";
                        }
                    }
                }
            }
        }
    }
    cout << str;
    return 0;
}
