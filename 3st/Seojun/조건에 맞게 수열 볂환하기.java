class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = arr;
        if(k%2==1){
            for(int i=0;i<arr.length;i++)
                arr[i]*=k;
        }
        if(k%2==0){
            for(int i=0;i<arr.length;i++)
                arr[i]+=k;
        }
        return answer;
    }
}