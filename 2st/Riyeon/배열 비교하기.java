class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length == arr2.length){
            int a1=0, a2=0;
            for(int i=0; i<arr1.length; i++){
                a1 += arr1[i];
                a2 += arr2[i];
            }
            if(a1 == a2)
                return 0;
            else
                return a1>a2? 1 : -1;
        }else
            return arr1.length > arr2.length? 1 : -1;
    }
}