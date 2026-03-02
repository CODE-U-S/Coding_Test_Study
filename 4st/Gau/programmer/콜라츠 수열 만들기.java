class Solution {
   public int[] solution(int n) {
       String str = n + " ";
       while (n != 1) { 
           n = n % 2 == 0 ? n / 2 : 3 * n + 1;
           str += n + " ";
       }
       String[] arr = str.split(" ");
       int[] answer = new int[arr.length];
       for(int i=0; i<answer.length; i++){
           answer[i] = Integer.parseInt(arr[i]);
       }
       return answer;
   }
}