class Solution {
   public int[] solution(int[] array) {
       int[] answer = new int[2];
       int max = array[0];
       int maxindex= 0;
       for(int i = 0; i<array.length; i++) {
           if(max<array[i]) {
               max = array[i];
               maxindex = i;
           }
       }
       answer[0] = max;
       answer[1] = maxindex;
       return answer;
   }
}