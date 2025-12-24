#include <iostream>

int main()
{
    double A, B;
    std::cin >> A >> B;

    std::cout.precision(12);
    std::cout << std::fixed;
    std::cout << A / B;
    
    return 0;
}