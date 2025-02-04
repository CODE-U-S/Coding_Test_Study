class Solution {
    public int[] solution(int[] array) {
        int max=0;
        int n =0;
        for(int i =0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
                n=i;
            }
        }
        int[] answer = {max,n};
        return answer;
    }
}