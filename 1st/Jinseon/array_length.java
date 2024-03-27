class Solution {
    public int[] solution(int[] arr, int n) {
        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0){
                if(arr.length % 2 == 1){
                    arr[i] += n;
                }
            } else {
                if(arr.length % 2 == 0){
                    arr[i] += n;
                }
            }
            
        }
        return arr;
    }
}