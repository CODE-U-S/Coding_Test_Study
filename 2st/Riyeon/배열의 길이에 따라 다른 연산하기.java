class Solution {
    public int[] solution(int[] arr, int n) {
        int l = arr.length;
        for(int i=0; i<arr.length; i++){
            if((l%2==0 && i%2==1)||(l%2==1 && i%2==0))
               arr[i] += n;
        }
        return arr;
    }
}