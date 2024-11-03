class Solution {
    public int solution(String my_string) {
        my_string = my_string.replaceAll("[a-zA-Z]", "");
        String[] arr = my_string.split("");
                
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
			answer += Integer.valueOf(arr[i]); 
		}
        return answer;
    }
}
