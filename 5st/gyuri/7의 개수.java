class Solution {
    public int solution(int[] array) {
        int answer = 0;
        
        int count = 0;
        
        
        for(int i=0; i<array.length; i++){
            String str = String.valueOf(array[i]);
            for(int j=0; j<str.length(); j++){
                if(str.charAt(j) == '7'){
                count++;
                }
            }
        }
        return count;
    }
}
