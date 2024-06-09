class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            for(int j=0; j<index; j++){
                ch++;
                if(ch > 'z') ch -= 26;
                if(skip.contains(String.valueOf(ch))) j--;
            }
            answer += ch;
        }
        return answer;
    }
}