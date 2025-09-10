class Solution {
    public int solution(int n) {
      
        int pieces=6;
        int count =1;
        
         while((pieces*count)%n!=0){
            count++;
         }
        return count;
    }
}