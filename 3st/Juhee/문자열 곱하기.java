class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i=0; i<k; i++){
            answer= answer+my_string;
        }
        return answer;
    }
}