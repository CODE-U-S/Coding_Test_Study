#include <iostream>

using namespace std;

int main(){
    int byte, howLong;
    cin >> byte;
    if(byte%4 > 0)
        howLong = byte/4 + 1;
    else
        howLong = byte/4;
    for(int i = 0; i < howLong; i++)
        cout << "long ";
    cout << "int";
}