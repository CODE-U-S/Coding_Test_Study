#include <iostream>
#include <algorithm>

using namespace std;

int main() {
	int input[4];
	cin >> input[0] >> input[1] >> input[2] >> input[3];
	input[2] -= input[0];
	input[3] -= input[1];
	
	cout << *min_element(begin(input), end(input));
}