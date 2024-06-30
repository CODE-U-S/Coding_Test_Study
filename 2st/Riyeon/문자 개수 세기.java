class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        for(char ch : my_string.toCharArray()){
            int cnt =0;
            for(char c = 'A'; c<='Z'; c++, cnt++)
                if(ch == c) answer[cnt]++;
            for(char c = 'a'; c<='z'; c++, cnt++)
                if(ch == c) answer[cnt]++;
        }
        
        return answer;
    }
}