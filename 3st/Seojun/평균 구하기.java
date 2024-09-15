class Solution {
    public double solution(int[] arr) {
        double as=0.0;
        for(int i  = 0; i<arr.length;i++) as+=arr[i];
        double answer = (double)(as/arr.length);
        return answer;
    }
}