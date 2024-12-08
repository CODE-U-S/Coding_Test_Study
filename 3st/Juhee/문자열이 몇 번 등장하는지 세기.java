class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        for (int i=0; i<myString.length(); i++) {
            String res = "";
            for (int j=i; j<myString.length(); j++) {
                char ch = myString.charAt(j);
                res += ch;
                if (res.equals(pat)) {
                    answer++;
                    break;
                } 
            }
            
        }
        return answer;
    }
}
