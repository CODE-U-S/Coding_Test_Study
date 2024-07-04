#include <iostream>

using namespace std;

int main()
{
    int min_burger = 2000, min_drink = 2000, input;
    for(int i = 0; i < 3; i++){
        cin >> input;
        min_burger = input < min_burger ? input : min_burger;
    }
        
    for(int i = 0; i < 2; i++){
        cin >> input;
        min_drink = input < min_drink ? input : min_drink;
    }
    
    cout << min_burger+min_drink-50 << endl;
}
