class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        
        if(A.equals(B)){
            return answer;
        }
        
        char[] a = A.toCharArray();
        String str = "";
        int len = a.length;
        int count = 0;
        
        while(len != count){
            str = String.valueOf(a[len-1]);
            
            for(int i = 0; i < len-1; i++){
                str += a[i];
            }
            
            answer++;
            
            if(str.equals(B)){
                return answer;
            }
            
            a = str.toCharArray();
            count++;
        }
        
        answer = -1;
        return answer;
    }
}