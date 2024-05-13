class Solution {
    public String solution(String my_string, int[] indices) {
        char[] ch = my_string.toCharArray();
        for(int i : indices){
            ch[i] = ' ';
        }
        
        String answer = "";
        for(char c : ch){
            if(c != ' ')
                answer += c;
        }
        return answer;
    }
}