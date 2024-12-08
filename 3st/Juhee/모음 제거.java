class Solution {
    public String solution(String my_string) {
       char[] c=my_string.toCharArray();                      
        String answer="";
        
        for(int i=0; i<my_string.length(); i++) {
            if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') {
                answer+="";                                                     
            } 
            else {                                                            
                answer+=c[i];                                                   
            }
        }
        return answer;
    }
}
