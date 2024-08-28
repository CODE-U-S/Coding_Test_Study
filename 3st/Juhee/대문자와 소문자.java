class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arry = my_string.toCharArray();
		String temp ="";
		for(int i = 0; i<arry.length; i++) {
			if( arry[i] >= 97 && arry[i] <= 122 ) {
				temp = arry[i] + "";
				answer += temp.toUpperCase();
			} else if( arry[i] >=65 && arry[i] <= 90){
				temp = arry[i] + "";
				answer += temp.toLowerCase();
			}
		}
        return answer;
    }
}
