class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = {};
        if (my_str.length() % n != 0) {
            answer = new String[my_str.length() / n + 1];
        } 
        else {
            answer = new String[my_str.length() / n];
        }
        
        int j = 0;
        for (int i = 0; i < answer.length; i++) {
            
            if (my_str.substring(j, my_str.length() - 1).length() < n) {
                answer[i] = my_str.substring(j, my_str.length());
            }
            else {
                answer[i] = my_str.substring(j, j + n);
            }
            j += n;
        }
        return answer;
    }
}