    class Solution {
        public int solution(int num, int n) {
            int answer = 0;
            if(num%n==0) answer=1;
            else
            System.out.println(num+"은 "+n+"배수이므로 "+answer+"을 return합니다.");
            return answer;
        }
    }