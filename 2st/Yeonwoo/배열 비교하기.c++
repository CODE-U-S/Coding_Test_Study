#include <string>
#include <vector>

using namespace std;

int solution(vector<int> arr1, vector<int> arr2) {
    int answer = 0;
    int a = arr1.size();
    int b = arr2.size();
    if(a!=b){
        if(a>b)
            answer = 1;
        else if(a<b)
            answer = -1;
    }
    else if(a==b) {
        int a_sum = 0;
        int b_sum = 0;
        for(int i=0; i<a; i++)
            a_sum+=arr1[i];
        for(int i=0; i<b; i++)
            b_sum+=arr2[i];
        if(a_sum==b_sum)
            answer = 0;
        else{
            if(a_sum>b_sum)
                answer = 1;
            else
                answer = -1;
        }
    }
    return answer;
}