package Sojeong.Programmers;

class Solution {
    public int solution(int n) {
        
        int answer = n; // 가장 작은 수를 찾기 위해 조건 내에서 가장 큰 수인 n을 할당
        
        for(int x = 2; x < n; x++) {
            // x에 가장 작은 수를 할당하고, n - 1까지 돌리면서 조건에 맞는 값을 찾아야 함
            // x = 2를 한 이유는 x를 1로 할당할 경우, 어떤 수를 나눠도 나머지가 0이 되기 때문
            if(n % x == 1) {
                answer = x;
                break;
            }
        }
        
        return answer;
    
    }
}
