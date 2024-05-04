package Sunhee.programmers;

class Solution {
    public int solution(int n) {
        
        int answer = 0;
        // 1. n을 2진수 변환.
        String str = Integer.toBinaryString(n);
        // 2. n의 1인 비트의 수를 저장하는 변수.
        int cnt =0;
        // 3. 1인 비트의 수를 카운팅.
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) == '1') cnt++;
        }
        // 4. n+1부터 반복.
        for(int i =n+1;i<1000000;i++){
            // 5. 위 과정을 반복.
            String temp = Integer.toBinaryString(i);
            int temp_cnt = 0;
            for(int j =0;j<temp.length();j++){
                if(temp.charAt(j) == '1') temp_cnt++;
            }
            // 6. 1인 비트의 수가 일치하면 해당 수를 담아 반복문 종료.
            if(temp_cnt == cnt) {
                answer = i;
                break;
            }
        }
        
        return answer;
    }
}h