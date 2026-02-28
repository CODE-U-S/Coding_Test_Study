class Solution {
    public int solution(int order) {
        int answer = 0;
        
        String str = String.valueOf(order);
        
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '3' || 
               str.charAt(i) == '6' || 
               str.charAt(i) == '9') {
                answer++;
            }
        }
        
        return answer;
    }
}