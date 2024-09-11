class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();
        
        
        for (int i=0; i<array1.length; i++) {
            answer += array1[i];
            answer += array2[i];
        }
        
        return answer;
    }
}