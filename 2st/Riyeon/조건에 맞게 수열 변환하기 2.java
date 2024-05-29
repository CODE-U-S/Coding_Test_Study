class Solution {
    public int solution(int[] arr) {
        int cnt = 0, n=0;
        while(n!=arr.length){
            n=0;
            for(int i=0; i<arr.length; i++){
                if((arr[i]>=50 && arr[i]%2==0) || (arr[i]<50 && arr[i]%2==1)) {
                    arr[i] = (arr[i]>=50 && arr[i]%2==0)? arr[i]/2 : arr[i]*2+1;
                }else
                    n++;
            }
            cnt++;
        }
        
        return cnt-1;
    }
}