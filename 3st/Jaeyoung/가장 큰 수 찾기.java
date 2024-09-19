class Solution {
    public int[] solution(int[] array) {
        int numbers=0;
        int max=0;
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
                numbers=i;
            }
        }
        int[] answer = {max,numbers};
        return answer;
    }
}