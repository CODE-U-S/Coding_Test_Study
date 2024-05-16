class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for(int i=0; i<myString.length()-pat.length()+1; i++){
            String s = myString.substring(i, i+pat.length());
            if(s.contains(pat))
                answer++;
        }
        return answer;
    }
}