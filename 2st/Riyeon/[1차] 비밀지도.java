class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        for(int i=0; i<arr1.length; i++){
            answer[i] = String.format("%"+n+"s", Integer.toBinaryString(arr1[i] | arr2[i]));
            answer[i] = answer[i].replaceAll("1", "#");
            answer[i] = answer[i].replaceAll("0", " ");
        }
        return answer;
    }
}