class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = new String[(int)Math.ceil((double)my_str.length() / n)];
        
        for (int i = 0; i < my_str.length() / n; i++) {
            answer[i] = my_str.substring(i * n, (i + 1) * n);
        }
        if (my_str.length() % n != 0) answer[answer.length - 1] = my_str.substring(my_str.length() - my_str.length() % n);
        
        return answer;
    }
}