class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int count = 0;
        int[] a = new int[arr.length];
        while(count != arr.length) {
            count = 0;
            a = arr.clone();
            for(int i =0; i<arr.length; i++) {
            if(arr[i]%2 == 0 && arr[i] >= 50) {
                arr[i] /= 2;
            }else if(arr[i]%2 != 0 && arr[i] < 50) {
                arr[i] = arr[i]*2 +1;
            }
            if(arr[i] == a[i] ) count ++;
        }
            answer ++;
        }
        
        return answer-1;
    }
}