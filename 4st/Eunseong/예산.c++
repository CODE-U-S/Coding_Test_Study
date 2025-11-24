#include <iostream>
#include <stdio.h>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

int solution(vector<int> d, int budget) {
    int sum = 0;
    sort(d.begin(), d.end());
    for (int i = 0; i < d.size(); i++) {
        sum += d.at(i);
        if (sum > budget) {
            return i;
        }
    }
    return d.size();
}