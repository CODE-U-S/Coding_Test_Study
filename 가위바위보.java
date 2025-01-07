class Solution {
    public String solution(String rsp) {
        StringBuilder answer = new StringBuilder(); 
        
       
        for (char ch : rsp.toCharArray()) {
            if (ch == '2') { 
                answer.append('0');
            } else if (ch == '0') { 
                answer.append('5');
            } else if (ch == '5') { 
                answer.append('2');
            }
        }
        
        return answer.toString(); 
    }
}
