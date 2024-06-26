class Solution {
    public String solution(String X, String Y) {
        StringBuilder sb = new StringBuilder();
        for(char ch='9'; ch>='0'; ch--){
            int xl = X.length() - X.replace(String.valueOf(ch), "").length();
            int yl = Y.length() - Y.replace(String.valueOf(ch), "").length();
            int min = Math.min(xl, yl);
            if(min > 0){
                for(int i=0; i<min; i++)
                    sb.append(ch);
            }
        }
        
        String answer = sb.toString();
        if(answer.isEmpty())
            answer = "-1";
        else if(answer.replace("0", "").isEmpty())
            answer = "0";
        
        return answer;
    }
}