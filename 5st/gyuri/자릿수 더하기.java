class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String num = Integer.toString(n);
        for(int i =0; i<num.length(); i++){
            char an = num.charAt(i);
            answer += Integer.parseInt(String.valueOf(an));
        }
        return answer;
    }
}