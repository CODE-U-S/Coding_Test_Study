class Solution {
    public int[] solution(int[] arr) {
        int min = arr[0];
        if(arr.length < 2) {
            int an[] = {-1};
            return  an;
        }
        int[] answer = new int[arr.length-1];
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
       int j = 0;
        for(int i = 0; i<answer.length; i++) {
            if(min == arr[i]) {
                j+=1;
            }
            answer[i] = arr[j];
            j++;
        }
        return answer;
    }
}
