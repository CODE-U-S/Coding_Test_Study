class Solution {
    public int[] solution(int[] array) {
        int[] arr = new int[2];
        int max = 0;
        int maxidx = 0;
        //[0,0,0]
        for(int i =0; i<array.length; i++){
            if(array[i] > max){
                max = array[i];
                maxidx = i;
            }
            arr[0] = max;
            arr[1] = maxidx;
        }
        return arr;
    }
}