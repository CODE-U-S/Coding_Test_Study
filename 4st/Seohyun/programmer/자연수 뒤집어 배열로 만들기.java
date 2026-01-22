class Solution {
    public int[] solution(long n) {
        
        String tempStr = String.valueOf(n);
        int[] answer = new int[tempStr.length()];
        int cnt = 0;
        
        for(int i=tempStr.length()-1; i>=0; i--) {
            answer[cnt]=tempStr.charAt(i)-'0';
            cnt++;
        }
        return answer;
    }
}